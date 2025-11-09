package gui;

import com.iesebre.usefulcode.DirectAccessFile;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Finestra extends JFrame {
    private JPanel panel;
    private JButton botoInsertar;
    private JButton botoBorrar;
    private JButton botoModificar;
    private JTextField campNom;
    private JTextField campCognoms;
    private JTable taula;
    private JComboBox comboBox1;
    //Model de dades de la taula
    private DefaultTableModel dtm;

//Fitxer d'accés directe
private DirectAccessFile<Pojo> daf;

    public Finestra() throws IOException, ClassNotFoundException {
        //Per poder visualitzar la finestra farem...
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        //Instanciem el fitxer
        daf=new DirectAccessFile<>("pojos.dat");

        //Carreguem les dades del fitxer al model de dades de la taula
        Object[][] dades=new Object[daf.size()][2];
        for (int i = 0; i < daf.size(); i++) {
            Pojo p=daf.readObject(i);
            dades[i][0]=p.getNom();
            dades[i][1]=p.getCognoms();
        }



        //Anem a establir el model de dades de la taula
        dtm=new DefaultTableModel(
                //Dades a mostrar
                dades,
                //definim les columnes de la taula
                new Object[]{"Nom","Cognoms"}
        );

        //Li asignem el model a la taula
        taula.setModel(dtm);

        taula.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Listeners dels diferents components de la finsetra
        botoInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!campNom.getText().isBlank() || !campCognoms.getText().isBlank()){
                    try {
                        daf.writeObject(new Pojo(campNom.getText().strip(),campCognoms.getText().strip()));
                        dtm.addRow(new Object[]{campNom.getText().strip(),campCognoms.getText().strip()});
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog((Component) actionEvent.getSource(), "Hi ha hagut un error al insertar");
                    }
                } else JOptionPane.showMessageDialog((Component) actionEvent.getSource(), "No pots insertar text en blanc!!");
            }
        });
        botoBorrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //Creem una variable per guardar la fila a borrar que serà la que tenim seleccionada
                int filaSel =taula.getSelectedRow();
                if(filaSel != -1){//Si es compleix la condició vol dir que hem seleccionat una fila
                    try {
                        daf.deleteObject(filaSel);
                        dtm.removeRow(filaSel);
                    } catch (ClassNotFoundException | IOException ex) {
                        JOptionPane.showMessageDialog(e.getComponent(), "Hi ha hagut algun problema al esborrar...");
                    }

                }
                else JOptionPane.showMessageDialog(e.getComponent(), "Has de seleccionar la fila que vols borrar!!");
            }
        });
        taula.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //Copio el contingut de la fila seleccionada als corresponents camps del formulari
                int filaSel =taula.getSelectedRow();
                if(filaSel != -1) { //Si es compleix la condició vol dir que hem seleccionat una fila
                    campNom.setText(taula.getValueAt(filaSel, 0).toString());
                    campCognoms.setText(taula.getValueAt(filaSel, 1).toString());
                } else {      //Hem des-seleccionat
                    campNom.setText("");
                    campCognoms.setText("");
                }
            }
        });
        botoModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Creem una variable per guardar la fila a borrar que serà la que tenim seleccionada
                int filaSel =taula.getSelectedRow();
                if(filaSel != -1 && (!campNom.getText().isBlank() || !campCognoms.getText().isBlank())) { //Si es compleix la condició vol dir que hem seleccionat una fila
                    try {
                        Pojo p=new Pojo(campNom.getText().strip(), campCognoms.getText().strip());
                        daf.updateObject(p, filaSel);
                        dtm.removeRow(filaSel);     //Primer borrem la fila seleccionada
                        dtm.insertRow(filaSel, new Object[]{p.getNom(),p.getCognoms()});
                        campNom.setText("");
                        campCognoms.setText("");
                    } catch (ClassNotFoundException | IOException ex) {
                        JOptionPane.showMessageDialog((Component) e.getSource(), "Hi ha hagut un error al modificar!!"); //Tant per al JOptionPane aquest com el de baix
                    }
                }
                else JOptionPane.showMessageDialog((Component) e.getSource(), "Has de seleccionar a la taula la que fila que vols modificar!!");


            }
        });
        //Posarem el codi que volem executar quan tanquem l'aplicació
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    daf.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(e.getComponent(), "Hi ha hagut algún error al tancar el programaj!!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Finestra f=null;
                try {
                f=new Finestra();
            } catch (ClassNotFoundException | IOException e) {
                JOptionPane.showMessageDialog(f, "Hi ha hagut algún error al programa!!");
                System.exit(1);
            }
            }
        });
    }

}

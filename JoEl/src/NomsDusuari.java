import java.util.Scanner;

public class NomsDusuari {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String usuari = ent.nextLine();
        char[] lletresDelUsuari = new char[9];

        for (int i = 0; i < usuari.length(); i++) {
            for (int j = 0; j < lletresDelUsuari.length; j++) {

                if (usuari.charAt(i) == lletresDelUsuari[j] || usuari.charAt(i) == Character.isWhitespace(usuari.charAt(i)) ) {
                    lletresDelUsuari[i] = '*';
                    break;
                } else if (usuari.charAt(i) != lletresDelUsuari[j] && j == lletresDelUsuari.length - 1){
                    lletresDelUsuari[i] = usuari.charAt(i);

                }
            }
        }
        for (int i = 0; i < lletresDelUsuari.length ; i++) {
            if (lletresDelUsuari[i] == '*') {
                continue;
            }
            System.out.print(lletresDelUsuari[i]);
        }
    }
}

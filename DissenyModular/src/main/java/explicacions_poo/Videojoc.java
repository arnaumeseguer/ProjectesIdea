package explicacions_poo;

//POJO: Plain Old Java Object
public class Videojoc {

    //Propietats dels videojocs --> Defineixen l'estat dels objectes
    private String nom="Nom per defecte";
    private String versio="1.0";
    private String creador ="Naughty Dog";
    private String categoria="Terror/Apocalipsis";
    private int maxJugadors;
    private double preu;
    private boolean multiplataforma;
    //Mètodes de la classe --> Defineixen el comportament dels objectes

    //Mètodes constructors --> Els usem per instanciar/construir/crear els objectes
    public Videojoc(){}


    public Videojoc(String nom, String versio, String creador, String categoria, int maxJugadors, double preu, boolean multiplataforma){
        this.nom=nom;
        this.versio=versio;
        this.creador=creador;
        this.categoria=categoria;
        this.maxJugadors=maxJugadors;
        this.preu=preu;
        this.multiplataforma=multiplataforma;
    }

    public Videojoc(String nom, String versio){
        this.nom=nom;
        this.versio=versio;
    }

    //Mètodes accessors --> getters i setters
    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom=nom;   //El "this.nom" apunta a la propietat de l'objecte mentre que el paràmetre nom apunta al paràmetre


    }
    public String getVersio() {
        return versio;
    }

    public void setVersio(String versio) {
        this.versio = versio;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getMaxJugadors() {
        return maxJugadors;
    }

    public boolean setMaxJugadors(int maxJugadors) {
        if (maxJugadors == this.maxJugadors && this.maxJugadors != maxJugadors) {
            this.maxJugadors = maxJugadors;
            return true;
        }
        return false;
    }

    public boolean isMultiplataforma() {    // --> Els getters de les propietats booleanes es diuen "isExemple", no "getExemple"
        return multiplataforma;
    }

    public void setMultiplataforma(boolean multiplataforma) {
        this.multiplataforma = multiplataforma;
    }

    //Mètodes "normals"

    /**
     * Incrementa el preu del joc segons el percentatge que passem
     * @param percentatge Nombre enter
     */
    public void incrementaPreus(int percentatge){
        this.preu=this.preu+(this.preu*percentatge/100);
    }

    //Mètodes heredats

    //Fet en RMB > Generate > toString()
    @Override
    public String toString() {
        return "Videojoc{" +
                "nom='" + nom + '\'' +
                ", versio='" + versio + '\'' +
                ", creador='" + creador + '\'' +
                ", categoria='" + categoria + '\'' +
                ", maxJugadors=" + maxJugadors +
                ", preu=" + preu +
                (multiplataforma ? ", És multiplataforma":", No és multiplataforma ") +
                '}';
    }
}

class Creadora{

    public static void main(String[] args) {
        //Instanciem videojocs --> Crear objectes de la classe videojoc
        Videojoc joc= new Videojoc();
        joc.setNom("Minecraft");    //Canviem el nom al nou videojoc
        joc.setCategoria("Aventura");
        joc.setVersio("1.21.4");
        joc.setCreador("Microsoft");
        joc.setPreu(29.99);
        joc.setMultiplataforma(true);
       // if (joc.setMaxJugadors(-5))
        System.out.println(joc.getNom());

        joc = new Videojoc("LOL", "14.20", "Riot Games", "Rol", 10, 0, false);
        System.out.println(joc.getNom());

        Videojoc[] jocs= new Videojoc[100];

        jocs[0] = joc;
        jocs[1]=new Videojoc();
        jocs[2] = joc;

        System.out.println(joc);
    }





}


package Introduccio;

public class dilluns16122024 {

    public static void parametresVariables(boolean... params) {
        //Primer mirem si params és null.
        if (params == null) return;
        for (int i = 0; i < params.length; i++) {
            if (params[i]) System.out.println("El paràmetre és cert");
            else System.out.println("fals");

        }
    }

    //Mètode que fa nosequé però si rep null retorna -1
    public static int paramsVarsRetornaEnter(double... args) {
        if (args == null) return -1;

        return args.length;
    }

    public static void main(String[] args) {
        boolean[] objecte = null;

        parametresVariables();
        parametresVariables(true);
        parametresVariables(true, false, false, true);

        parametresVariables(new boolean[]{true, false, false, true});
        objecte = metodeQueVedUnaAltraClasse();
        parametresVariables(objecte);

        System.out.println(paramsVarsRetornaEnter());
        System.out.println(paramsVarsRetornaEnter(20));
        System.out.println(paramsVarsRetornaEnter(29.5, 3.4));
        System.out.println(paramsVarsRetornaEnter(null));

    }

    private static boolean[] metodeQueVedUnaAltraClasse() {
        return null;


    }
}
    class Segona {


        public static boolean barreja(int param1, double... params) {
            System.out.println("Estic al primer");
            return true;

        }

        public static boolean barreja(double... params) {
            System.out.println("Estic al segon");
            return false;

        }

        public static boolean barreja(int... params) {
            System.out.println("Estic al tercer");
            return true;

        }

        //public static void malaBarreja(int... params, int p){}

        //public static void  malaBarreja(int... params1, float... params2){}


        public static void main(String[] args) {
            barreja(1);
            barreja(1.5);
            barreja(1, 2.5, 3.7, 4.4);
            barreja(23, null);
            barreja(4.5, 2.6,6.2);
        }











    }














package Exercicis;

public class ExerciciDelSanti{
    public static int[] tractaParametres(int... params){
        //tractament de casos especials
        if (params == null)return null;
        if (params.length == 0)return null;


        //Tractament de vectors en caselles
       int suma = 0, max = Integer.MAX_VALUE, min = Integer.MAX_VALUE;

        for (int i = 1; i < params.length; i++) {
            //Actualitzem el Màxim si cal
            if (params[i] > max) max = params[i];
            //Actualitzem el Màxim si cal
            if (params[i] < min)  min = params[i];
            //Sumem el valor de la casella actual
            suma += params[i];

        }


        return new int[]{suma, params.length, max, min};
    }

    public static void main(String[] args) {
        tractaParametres();

        tractaParametres(null);

        tractaParametres(new int[]{});
    }

}
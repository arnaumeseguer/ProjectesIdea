package Introduccio;

import java.util.Random;
//He ficat arguments a la configuració
public class Dilluns02122024 {

    //Ha de mostrar un missatge Hello world! i assignar un valor aleatori a una variable
    public static void main(String[] args) {
        //Declaració de varbiales del main
        int variable;

        //Anem a recorrer els args
        for (int i = 0; i < args.length; i++) {
            if (args[0].equals("Avui")) System.out.println("Okay");
            else System.out.println(args[i]);

        }

        //Cridem al mètode de baix
        metodeDibuixar();

        //Cridem al mètode que genera valor aleatori
        System.out.printf("El numero aleatori generat és el %d%n", generaNumeroAleatori(6));

    }


    //Anem a crear un nou mètode
    public static void metodeDibuixar(){
        //codi del mètode
        System.out.println("Hello world inside a method!");
    }
    //Metode que retorna qualsevol numero enter correcte
    public static int generaNumeroAleatori(){
        Random r = new Random();

        return r.nextInt();
    }

    //Metode que retorna un numero enter entre 0 i el paràmetre-1
    public static int generaNumeroAleatori(int bound){
        Random r = new Random();
        int valor;
        return r.nextInt(bound);
    }



}





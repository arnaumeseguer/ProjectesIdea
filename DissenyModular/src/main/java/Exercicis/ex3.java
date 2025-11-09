package Exercicis;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        final int F=20;
        final int C=20;
        final int P=20;

        //Demanem quin alumne vol consultar
        int alumne = demanaValor("l'alumne", F);

        //Demanem quin mòdul vol consultar
        int mp = demanaValor("el mòdul", C);

        //Demanem quina nota vol consultar
        int nota = demanaValor("la nota", P);

    }

    public static int demanaValor(String text, int num){
        Scanner entrada = new Scanner(System.in);
        int valor;
        do{
            System.out.format("\nIntroduix %s a consultar (0-%d):\n", text ,num-1);
            valor=entrada.nextInt();
        }while(valor<0 || valor>=num);



        return valor;
    }

}

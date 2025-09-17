package org.example;

import java.util.Scanner;

public class ValidacioEdat {


    /**
     * Mètode que demana l'edat i, si és més petita que 18, mostra un error.
     * @param edat - l'edat introduïda
     * @return l'edat
     * @throws ArithmeticException si l'edat és menor de 18
     */
    public static int comprovarEdat(int edat){
        Scanner ent = new Scanner(System.in);

            try {
                System.out.println("Introdueix la teva edat: ");
                if (edat < 18){
                throw new  ArithmeticException();
                }
            } catch (ArithmeticException e){
                System.out.println("L'edat es menor de 18!");
            }



        return edat;
    }
}

package org.example;

public class Calculadora {
    public static int dividir(int a, int b){
        int resultat=0;
        try{
            if (b == 0) throw new ArithmeticException();
            resultat = a/b;

        }catch (ArithmeticException e){
            System.out.println("No es pot dividir per 0!");
        }
        return resultat;

    }


    public static void main(String[] args) {
        System.out.println(dividir(10, 2));
    }
}

package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num=0;
        boolean esText=true;

        do {
            System.out.println("Escriu un numero major que 0");
            try{
                num=Integer.valueOf(ent.nextLine());
                if(num > 0)break;
                throw new NumberFormatException();
            }catch (NumberFormatException e){
                System.out.println("Has escrit un numero incorrecte!!");
            }
        }while (true);

        System.out.println(num);
    }
}
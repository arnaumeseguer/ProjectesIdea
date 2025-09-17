package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num=0;
        boolean esText=true;

        do {
            System.out.println("Escriu un numero major que 0");
            try{
                num=Integer.valueOf(ent.nextLine());
                System.out.println("Divisió de 10 pel numero introduït: "+ (10/num));
                if(num > 0)break;
                throw new NumberFormatException();
            }catch (NumberFormatException e){
                System.out.println("Has escrit un numero incorrecte!!");
            }catch (ArithmeticException e){
                System.out.println("Has escrit el numero 0!!");
            }
        }while (true);

        System.out.println(num);
    }
}
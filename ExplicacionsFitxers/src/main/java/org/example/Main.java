package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num=0;

        do {
            System.out.println("Escriu un numero enter qualsevol");
            try{
                num= ent.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Has escrit un numero incorrecte!!");
                ent.next();     //Evita bucle infinit tractant el salt de linia de la anterior lectura.
            }
        }while (true);

        System.out.println(num);
    }
}
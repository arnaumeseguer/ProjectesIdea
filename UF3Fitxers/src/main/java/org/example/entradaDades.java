package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class entradaDades {

    public static int llegirEnter(){
        Scanner ent = new Scanner(System.in);
        int marrameu =0;

            try{
                marrameu = ent.nextInt();

            }catch (InputMismatchException e){
                System.out.println("El nombre Introduït és incorrecte!");
            }finally {
                System.out.println("Sempre mostro aquest missatge");
            }


    return marrameu;

    }

    public static void main(String[] args) {
        llegirEnter();
    }















}

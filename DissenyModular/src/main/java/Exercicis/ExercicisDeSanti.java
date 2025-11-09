package Exercicis;

import java.util.Random;
import java.util.Scanner;

public class ExercicisDeSanti {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        MostraVarisCaracters(30);
    }


    public static void retornaCaracter(int quantitat, char caracterMin, char caracterMax) {
        //Comprovem si els paràmetres estan ordenats correctament, si no els intercanviem
        if (caracterMax < caracterMin) {
            char temporal = caracterMax;
            caracterMax = caracterMin;
            caracterMin = temporal;
        }
        //
        Random r = new Random();
        for (int i = 0; i < quantitat; i++) {
            System.out.print((char) r.nextInt(caracterMin, caracterMax));

        }

    }
    public static char retornaCaracter() {
        Random r = new Random();
        return (char) (r.nextInt(94) + 32); // Generar un caràcter aleatori entre 32 i 125
    }

    public static char retornaCaracter(char caracterMinim, char caracterMaxim) {
        // Comprovem si els paràmetres estan ordenats correctament
        if (caracterMinim > caracterMaxim) {
            char temp = caracterMinim;
            caracterMinim = caracterMaxim;
            caracterMaxim = temp;
        }
        Random r = new Random();
        return (char) (r.nextInt(caracterMaxim - caracterMinim + 1) + caracterMinim);
    }

    public static void MostraVarisCaracters(int nombres) {
        Random r = new Random();
        for (int i = 0; i < nombres; i++) {
            System.out.print((char) r.nextInt(' ', '}'));

        }
    }
}









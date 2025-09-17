package Exercicis;

import static com.arnau.library2425.Data.esBixest;

public class Ex38 {
    public static void main(String[] args) {
        if (esBixest(555)) System.out.println("Any bixest");
        else System.out.println("Any normal");

        System.out.println(dataCorrecta(29, 2, 2000) ? "Data Correcta!!" : "Data incorrecta!!");
    }

    public static boolean dataCorrecta(int dia, int mes, int any) {
        // Vector que conte la durada dels 12 mesos de l'any
        int[] mesos = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Mirem si l'any és bixest per modificar la durada del febrer
        if (esBixest(any)) mesos[1] = 29;

        // Mirem si el mes és correcte
        if (mes < 1 || mes > 12) return false;

        // Mirem si esl dia és correcte
        return dia >= 1 && dia <= mesos[mes - 1];
    }
}
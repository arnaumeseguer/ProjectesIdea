package Introduccio;

public class Dimarts17122024 {

    public static String metodeNoRecursiu(){
        String text = "hola";
        System.out.println(text);
        return text;
    }

    public static int metodeRecursiu(int n){
        if (n == 0) return 0;
        return n + metodeRecursiu(n - 1);



    }

    public static void main(String[] args) {
        System.out.println(metodeRecursiu(5));
    }












}

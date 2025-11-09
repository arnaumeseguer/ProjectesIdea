package Exercicis;

public class Ex4 {
    /**
     * Inserta una subcadena dins d'un text a partir d'una posició
     * @param text el text inicial 
     * @param subcadena text que volem insertar
     * @param pos posició a partir de la cual volem insertar
     * @return La cadena resultant
     */
    public static String insertaCadena(String text, String subcadena, int pos){
       if (text==null && subcadena==null) return null;
       if (subcadena==null) return text;
       if (text==null) return subcadena;
       if(pos<0) pos=0;
       if(pos>text.length()) pos=text.length();

       return text.substring(0,pos)+subcadena+text.substring(pos);
    }
}

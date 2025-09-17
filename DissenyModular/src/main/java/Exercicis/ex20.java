package Exercicis;

public class ex20 {
    public static void main(String[] args) {
        System.out.println(reemplassaMultiplesCaracters(null, ' ', ' '));
        System.out.println(reemplassaMultiplesCaracters("", ' ',' '));
        System.out.println(reemplassaMultiplesCaracters("Hola", 'p', 'o'));
        System.out.println(reemplassaMultiplesCaracters("Hola", 'p', 'o', null));
        System.out.println(reemplassaMultiplesCaracters("Hola", 'p', 'o', new char[]{}));
        System.out.println(reemplassaMultiplesCaracters("Hola", 'p', 'o', new char[]{'H', 'l','a'}));
        System.out.println(construeixCadena('y', 'u', 'j'));

    }


    public static String reemplassaMultiplesCaracters(String text, char substitut, char buscat, char... buscats){
        //Tractar sempre la condicio null primer
        if (text == null || text.isEmpty()) return text;

        //Tractem el cas general
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); //caracter que tractem
            if (c == buscat) resultat += substitut;
            else {
                //falta mirar si el caràcter actual és un dels buscats
                if (buscats != null) {
                    //Anem a buscar a c dins del vector buscats
                    int j = 0;
                    for ( ; j < buscats.length && buscats[j] != c ;j++ );
                    if (j<buscats.length)      //caracter acutal trobat dins del vector
                        resultat += substitut;
                    else
                        resultat += c;

                } else resultat += c;

//            resultat += (c== buscat?substitut:c);

            }
        }

        return resultat;
    }
    //mètode que retonra un String format pels caracters que rep com a paràmetres
    public static String construeixCadena (char buscat, char... buscats){
        String resultat = "" + buscat;
        for (int i = 0; i < buscats.length; i++) {
            resultat += buscats[i];

        }



        return resultat;
    }

































}

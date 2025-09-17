package org.example;

public class Main6 {
    public static void main(String[] args) {


            try{
                int[] array=new int[]{1,2,3};
                String string="123";
                int index=2;
                System.out.println(string.charAt(index));
                System.out.println(array[index]);


            }       //Els catch sempre han d'anar tractant excepcions de més específiques a més generals.
            catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
                System.out.println("Hi ha hagut un error conegut!!");
            }catch (IndexOutOfBoundsException e){
                System.out.println("Hi ha hagut un error desconegut!!");
            }catch (Exception e){
                System.out.println("Hi ha hagut una excepció que no se d'on ve");
            }finally {
                //Es posen instruccions que volem que s'executen tant si hi ha alguna excepció com si no
                System.out.println("Sempre m'executo, perque estic al finally!!");
                //fixter.close();       Comentat perque fitxer.close no fa res (de moment)
        }

    }
}
package org.example;

public class Propagadora {

    /**
     * Fa no se que
     * @param num
     * @return res perque peta
     * @throws NullPointerException sempre
     */
    public static int generaExcepcio(int num) throws NullPointerException {
        try {
            return num / 0;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }


}

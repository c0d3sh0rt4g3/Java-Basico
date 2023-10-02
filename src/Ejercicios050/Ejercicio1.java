package Ejercicios050;

public class Ejercicio1 {
    public static void main (String[] args){
        int[] numArray = new int[12];
        numArray[0] = 39;
        numArray[1] = -2;
        numArray[4] = 0;
        numArray[6] = 14;
        numArray[7] = 5;
        numArray[9] = 120;

        for (int i : numArray) {
            System.out.println(i);
        }
    }
}

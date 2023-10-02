package Ejercicios051;

import java.util.Random;

public class Ejercicio6{
    public static void main(String[] args) {
        int[][] array = new int[6][10];
        Random random = new Random();
        boolean[] usedNumbers = new boolean[1001];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                int randomNumber;
                do {
                    randomNumber = random.nextInt(1001);
                } while (usedNumbers[randomNumber]);
                array[i][j] = randomNumber;
                usedNumbers[randomNumber] = true;
            }
        }

        int max = array[0][0];
        int min = array[0][0];
        int maxRow = 0, maxCol = 0, minRow = 0, minCol = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("Array:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Position of Maximum Value: Row " + maxRow + ", Column " + maxCol);
        System.out.println("Position of Minimum Value: Row " + minRow + ", Column " + minCol);
    }
}

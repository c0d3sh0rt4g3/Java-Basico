package Ejercicios051;

import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(900) + 100;
            }
        }

        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("| " + sumaFilas[i]);
        }

        for (int j = 0; j < 5; j++) {
            System.out.print("--------");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print(sumaColumnas[j] + "\t");
        }
        System.out.println();

        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("Suma total: " + sumaTotal);
    }
}

package Ejercicios04;

import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int max = 100;
        int min = 199;
        int sum = 0;

        System.out.print("Números aleatorios: ");
        for (int i = 0; i <= 50; i++) {
            int num = rand.nextInt(101) + 100;
            System.out.print(num + " ");

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            sum += num;
        }

        double avg = (double) sum / 50;

        System.out.println("\nMáximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + avg);
    }
}


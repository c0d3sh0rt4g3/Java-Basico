package Ejercicios050;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(401);
        }

        System.out.println("Original array:");
        displayArray(numbers);

        System.out.println("Do you want to highlight multiples of 5 or multiples of 7?");
        System.out.print("Enter '5' or '7': ");
        int option = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if ((option == 5 && numbers[i] % 5 == 0) || (option == 7 && numbers[i] % 7 == 0)) {
                numbers[i] = -numbers[i];
            }
        }

        System.out.println("Array with highlighted multiples:");
        displayArray(numbers);

        scanner.close();
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            if (arr[i] < 0) {
                System.out.print("**" + Math.abs(arr[i]) + "**");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}


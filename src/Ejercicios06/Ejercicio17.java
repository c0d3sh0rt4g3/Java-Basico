package Ejercicios06;

import java.util.Scanner;

public class Ejercicio17 {

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            char digit = binary.charAt(binaryLength - 1 - i);
            if (digit == '1') {
                decimal += Math.pow(2, i);
            } else if (digit != '0') {
                throw new IllegalArgumentException("Entrada no válida: El número binario contiene caracteres no válidos.");
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número binario: ");
        String binary = scanner.nextLine();

        try {
            int decimal = binaryToDecimal(binary);
            System.out.println("El número decimal equivalente es: " + decimal);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

package Ejercicios02;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero de hasta 5 cifras: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 99999) {
            String numberStr = String.valueOf(number);
            char primeraCifra = numberStr.charAt(0);

            System.out.println("La primera cifra del número es: " + primeraCifra);
        } else {
            System.out.println("El número ingresado no es válido. Debe ser un número entero de hasta 5 cifras.");
        }
    }
}

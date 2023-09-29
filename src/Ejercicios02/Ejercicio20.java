package Ejercicios02;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo de hasta 5 cifras: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 99999) {
            int originalNumber = number;
            int inversedNumber = 0;
            int digit;

            while (number > 0) {
                digit = number % 10;
                inversedNumber = inversedNumber * 10 + digit;
                number /= 10;
            }

            if (originalNumber == inversedNumber) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        } else {
            System.out.println("El número ingresado no es válido. Debe ser un número entero positivo de hasta 5 cifras.");
        }

    }
}

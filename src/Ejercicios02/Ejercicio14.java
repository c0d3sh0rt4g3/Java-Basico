package Ejercicios02;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        float number = scanner.nextFloat();
        if (number % 2 == 0 && number % 5 == 0){
            System.out.println("El numero es par y divisible entre 5.");
        } else if (number % 2 == 0) {
            System.out.println("El numero solo es par 2.");
        } else if (number % 5 == 0) {
            System.out.println("El numero solo es divisible entre 5.");
        }
    }
}

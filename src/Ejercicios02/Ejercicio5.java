package Ejercicios02;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce the value of b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The ecuation" + a +"x + " + b + " = 0, has infinite solujtions");
            } else {
                System.out.println("The ecuation: 0x + " + b + " = 0, has no solutions");
            }
        } else {
            double x = -b / a;

            System.out.println("x value would be: " + x);
        }
    }
}
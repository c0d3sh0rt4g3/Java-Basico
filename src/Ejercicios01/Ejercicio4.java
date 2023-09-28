package Ejercicios01;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number:");
        float number1 = scanner.nextFloat();
        System.out.println("Introduce another number:");
        float number2 = scanner.nextFloat();
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 / number2));
    }
}

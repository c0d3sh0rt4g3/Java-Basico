package Ejercicios01;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce a product price without taxes:");
        float taxBase = scanner.nextFloat();
        float taxPercent = 0.21F;
        float finalPrice = (taxBase * taxPercent) + taxBase;
        System.out.println("The product price with taxes added would be " + finalPrice + " euros.");
    }
}

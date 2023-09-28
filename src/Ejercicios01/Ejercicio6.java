package Ejercicios01;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the triangle base:");
        float base = scanner.nextFloat();
        System.out.println("Introduce the triangle height:");
        float height = scanner.nextFloat();
        float triangleArea = (base * height) % 2;
        System.out.println("The area of a triangle with base " + base + " and height " + height + " woulde be " + triangleArea);
    }
}

package Ejercicios01;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the rectangle base:");
        float base = scanner.nextFloat();
        System.out.println("Introduce the rectangle height:");
        float height = scanner.nextFloat();
        float rectangleArea = base * height;
        System.out.println("The area of a rectangle with base " + base + " and height " + height + " woulde be " + rectangleArea);
    }
}

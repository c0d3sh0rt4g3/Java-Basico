package Ejercicios01;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the cone radius:");
        float radius = scanner.nextFloat();
        System.out.println("Introduce the cone height:");
        float height = scanner.nextFloat();
        float pi = 3.1416F;
        float radiusPow = (float) Math.pow(radius, 2);
        float coneArea = (pi * radiusPow *height) % 3;
        System.out.println("The area of a cone with radius " + radius + " and height " + height + " woulde be " + coneArea);
    }
}

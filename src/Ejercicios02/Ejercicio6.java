package Ejercicios02;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float gravity = 9.81F;
        System.out.println("From which height is the body falling?");
        float height = scanner.nextFloat();
        float fallingTime = (float) sqrt((2 * height) / gravity);
        System.out.println("The object will fall in " + fallingTime + " seconds");
    }
}

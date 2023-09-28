package Ejercicios01;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        float tasaConversion = 166.3860F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many euros do you want to change to pesetas?");
        float euros = scanner.nextFloat();
        float pesetas = euros * tasaConversion;
        System.out.println(euros + " euros serán " + pesetas + " pesetas");
    }
}

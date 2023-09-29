package Ejercicios02;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primera nota:");
        float firstMark = scanner.nextFloat();
        System.out.println("Segunda nota:");
        float secondMark = scanner.nextFloat();
        System.out.println("Tercera nota:");
        float thirdMark = scanner.nextFloat();
        float markAvg = (firstMark + secondMark + thirdMark) / 3;
        String bulletinMark = "Insuficiente"; 
        if (markAvg >= 5 && markAvg < 6){
            bulletinMark = "Suficiente";
        } else if (markAvg >= 6 && markAvg < 7) {
            bulletinMark = "Bien";
        } else if (markAvg >= 7 && markAvg < 9) {
            bulletinMark = "Notable";
        } else if (markAvg > 9) {
            bulletinMark = "Sobresaliente";
        }
        System.out.println("Has sacado un " + bulletinMark);
    }
}

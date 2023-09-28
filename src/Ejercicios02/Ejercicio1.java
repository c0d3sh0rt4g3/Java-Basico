package Ejercicios02;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a weekday:");
        String weekDay = scanner.next().toLowerCase();
        String subject = switch (weekDay) {
            case "monday" -> "DWES";
            case "tuesday" -> "HLC";
            case "wednesday" -> "DWEC";
            case "thursday" -> "EIE";
            case "friday" -> "DWEC";
            default -> "You have no classes that day at first hour";
        };
        System.out.println(subject);
    }
}

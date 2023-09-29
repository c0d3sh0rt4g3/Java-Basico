package Ejercicios02;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number between 1 and 7");
        int weekDayNumber = scanner.nextInt();
        String weekDay = switch (weekDayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "The data introduced it's not a number between 1 and 7";
        };
        System.out.println(weekDay);
    }
}

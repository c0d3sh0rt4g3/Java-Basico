package Ejercicios02;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a weekday:");
        String weekDay = scanner.next().toLowerCase();
        String subject;
        switch (weekDay){
            case "monday":
                subject = "Server";
        }
    }
}

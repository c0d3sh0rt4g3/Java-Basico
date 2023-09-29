package Ejercicios02;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce el día de tu nacimiento (1-31): ");
        int day = scanner.nextInt();
        System.out.println("Ahora, introduce el mes de tu nacimiento (1-12): ");
        int month = scanner.nextInt();
        String horoscope = "";
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            horoscope = "Aries";
        } else if (month == 4 || month == 5 && day <= 20) {
            horoscope = "Tauro";
        } else if (month == 5 || month == 6 && day <= 20) {
            horoscope = "Géminis";
        } else if (month == 6 || month == 7 && day <= 22) {
            horoscope = "Cáncer";
        } else if (month == 7 || month == 8 && day <= 22) {
            horoscope = "Leo";
        } else if (month == 8 || month == 9 && day <= 22) {
            horoscope = "Virgo";
        } else if (month == 9 || month == 10 && day <= 22) {
            horoscope = "Libra";
        } else if (month == 10 || month == 11 && day <= 21) {
            horoscope = "Escorpio";
        } else if (month == 11 || month == 12 && day <= 21) {
            horoscope = "Sagitario";
        } else if (month == 12 || month == 1 && day <= 19) {
            horoscope = "Capricornio";
        } else if (month == 1 || month == 2 && day <= 18) {
            horoscope = "Acuario";
        } else if (month == 2 || month == 3) {
            horoscope = "Piscis";
        }
        System.out.println("Tu horóscopo es: " + horoscope);
    }
}

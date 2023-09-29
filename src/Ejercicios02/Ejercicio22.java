package Ejercicios02;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el numero del día de la semana: ");
        int weekDay = scanner.nextInt();

        System.out.print("Ingresa la hora (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Ingresa los minutos (0-59): ");
        int minutes = scanner.nextInt();

        int minutesLeft = 0;

        if (weekDay < 5) {
            minutesLeft = (15 - hour) * 60 - minutes;
        }

        minutesLeft += (4 - weekDay) * 24 * 60;

        System.out.println("Minutos restantes para el fin de semana: " + minutesLeft + " minutes.");
    }
}


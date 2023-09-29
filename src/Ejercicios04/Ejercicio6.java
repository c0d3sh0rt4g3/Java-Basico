package Ejercicios04;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int secretNumb = rand.nextInt(101);
        int tries = 5;
        while (tries > 0){
            System.out.println("Dame un numero del 0 al 100:");
            int numberGuess = scanner.nextInt();
            if (numberGuess == secretNumb) {
                System.out.println("¡Felicidades! Has adivinado el número secreto.");
                break; // Sale del bucle
            } else {
                tries--;
                if (numberGuess < secretNumb) {
                    System.out.println("El número secreto es mayor. Oportunidades restantes: " + tries);
                } else {
                    System.out.println("El número secreto es menor. Oportunidades restantes: " + tries);
                }
            }

            if (tries == 0) {
                System.out.println("¡Te has quedado sin oportunidades! El número secreto era " + secretNumb + ".");
            }
        }
    }
}

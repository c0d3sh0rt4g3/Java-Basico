package Ejercicios03;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int safeCode = 2060;
        int tries = 4;
        while (tries != 0){
            System.out.println("Introduce the 4 digit safe lock code please:");
            int safeCodeIntroduced = scanner.nextInt();
            System.out.println("Opening safe...");
            if (safeCodeIntroduced == safeCode){
                System.out.println("Safe succesfully opened.");
                break;
            }else {
                tries--;
                System.out.println("Incorrect code, tries left: " + tries);
            }
        }
        if (tries == 0){
            System.out.println("You don't have tries left to open the safe.");
        }
    }
}

package Ejercicios050;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] numArray = new int[100];
        Random randomNum = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            numArray[i] = randomNum.nextInt(501);
        }
        System.out.println("Our array: " + Arrays.toString(numArray));
        System.out.println("Do you want to see the maximum number or the minimum (max / min)?");
        String maxMinAnswer = scanner.next().toLowerCase();
        int maxOrMin = 0;
        if (maxMinAnswer.equals("max") || maxMinAnswer.equals("maximum")){
            maxOrMin = Arrays.stream(numArray).max().getAsInt();
        }else if (maxMinAnswer.equals("min") || maxMinAnswer.equals("minimum")){
            maxOrMin = Arrays.stream(numArray).min().getAsInt();
        }else {
            System.out.println("That answer it's not valid.");
            exit(1);
        }

        for (int i :numArray){
            if (i == maxOrMin){
                System.out.print("**" + i + "** ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}


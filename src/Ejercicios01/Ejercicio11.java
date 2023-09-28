package Ejercicios01;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Kbs do you want to turn into Mbs?");
        float kbGiven = scanner.nextFloat();
        float mbGotten = kbGiven / 1000;
        System.out.println(kbGiven + "Kbs would be " + mbGotten + "Mbs.");
    }
}

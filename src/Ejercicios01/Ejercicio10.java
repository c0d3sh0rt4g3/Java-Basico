package Ejercicios01;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Mbs do you want to turn into Kbs?");
        float mbGiven = scanner.nextFloat();
        float kbGotten = mbGiven * 1000;
        System.out.println(mbGiven + "Mbs would be " + kbGotten + "Kbs.");
    }
}

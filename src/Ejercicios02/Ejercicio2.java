package Ejercicios02;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it?");
        int time = scanner.nextInt();
        String hello;
        if (time < 0 || time > 24){
            hello = "The time introduced it's not valid.";
        } else if(time >= 5 && time <= 11){
            hello = "Good morning";
        } else if (time > 11 && time <= 19) {
            hello = "Good afternoon";
        } else {
            hello = "Good evening";
        }
        System.out.println(hello);
    }
}

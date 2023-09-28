package Ejercicios01;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        float tasaConversion = 0.0060F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pesetas do you want to change to euros?");
        float pesetas = scanner.nextFloat();
        float euros = tasaConversion * pesetas;
        System.out.println(pesetas + " pesetas serán " + euros + " euros");
    }
}

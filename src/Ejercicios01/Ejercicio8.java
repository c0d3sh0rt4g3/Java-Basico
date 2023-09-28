package Ejercicios01;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int salaryPerHour = 12;
        System.out.println("How many hours did you worked?");
        int hoursWorked = scanner.nextInt();
        int salary = salaryPerHour * hoursWorked;
        System.out.println("Your salary would be " + salary + " euros.");
    }
}

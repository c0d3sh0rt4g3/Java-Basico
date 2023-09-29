package Ejercicios02;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int salaryPerHour = 12;
        int extraSalaryPerHour = 16;
        System.out.println("How many hours did you worked?");
        int hoursWorked = scanner.nextInt();
        if (hoursWorked > 40){
            int fourtyHours = 40;
            int extraHours = hoursWorked - fourtyHours;
            int extraSalary = extraHours * extraSalaryPerHour;
            int salary = salaryPerHour * 40 + extraSalary;
            System.out.println("Your salary would be " + salary + " euros.");
        }else {
            int salary = salaryPerHour * hoursWorked;
            System.out.println("Your salary would be " + salary + " euros.");
        }
    }
}

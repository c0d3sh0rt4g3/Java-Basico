package Ejercicios01;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your mark on the first exam: ");
        double firstExamMark = scanner.nextDouble();
        System.out.println("Introduced your wanted mark: ");
        double avgWanted = scanner.nextDouble();
        double neededMark = (avgWanted - (firstExamMark * 0.4)) / 0.6;
        System.out.println("Para obtener una media de " + avgWanted +" necesitas sacar un " + neededMark + " en el segundo examen.");
    }
}


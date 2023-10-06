package Ejercicios04;

import java.util.Random;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println("¿En qué número estás pensando?");
        Scanner escaner = new Scanner(System.in);
        var numero = escaner.nextInt();
        Random rand = new Random();
        var minimo = 0;
        var maximo = 100;
        for (var i = 0;i<5;i++){
            var adivinar = rand.nextInt(minimo,maximo);
            System.out.println(adivinar);
            if (adivinar == numero){
                System.out.println("La máquina lo advinó, era el "+numero);
                break;
            }
            if (adivinar>numero && adivinar<maximo ){
                maximo=adivinar;
            }
            if (adivinar<numero && adivinar>minimo){
                minimo=adivinar;
            }
        }
    }
}

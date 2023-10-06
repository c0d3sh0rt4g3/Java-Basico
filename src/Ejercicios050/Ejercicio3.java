package Ejercicios050;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[]numeros = new int[10];
        Scanner escaner = new Scanner(System.in);
        for (var i = 0;i<10;i++){
            System.out.println("Introduce un número");
            var numero = escaner.nextInt();
            numeros[i]= numero;
        }
        for(var i = numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
}

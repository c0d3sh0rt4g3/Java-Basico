package Ejercicios06;

import static Ejercicios06.Ejercicio3.isPrime;

public class Ejercicio15 {
    public static void main(String[]  args){
        for (int i = 0; i < 1000; i++){
            if (isPrime(i)){
                System.out.println(i + " is a prime number.");
            }
        }
    }

}

package Ejercicios06;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio20 {
    public static void generarArray(int minimo, int maximo, int numero){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(var i = 0;i<numero;i++){
            Random rand = new Random();
            int num = rand.nextInt(minimo,maximo);
            numeros.add(num);
        }
        System.out.println(numeros);
    }
    public static void main (String[]args){
       generarArray(1,20,5);
    }
}

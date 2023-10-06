package Ejercicios050;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (var i = 0;i<20;i++){
            var num = random.nextInt(0,100);
            numero[i]=num;
        }
        for (var i = 0;i<20;i++){
            cuadrado[i] =numero[i]*numero[i];
        }
        for (var i = 0;i<20;i++){
            cubo[i] =numero[i]*numero[i]*numero[i];
        }
        for (var i = 0;i<20;i++){
            System.out.println(numero[i] +" "+ cuadrado[i] +" "+ cubo[i]);
        }
    }
}

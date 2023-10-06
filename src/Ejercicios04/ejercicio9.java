package Ejercicios04;

import java.util.Random;

public class ejercicio9 {
    public static void main(String[] args) {
        var check = true;
        var contador = 0;
        while (check){
            Random rand = new Random();
            var num = rand.nextInt(0,100);
            if (num%2 != 0){
               continue;
            }
            System.out.println(num);
            contador+=1;
            if (num==24){
                check = false;
            }
        }
        System.out.println(contador + "numeros");

    }
}

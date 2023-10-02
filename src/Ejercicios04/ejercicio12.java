package Ejercicios04;

import java.util.Random;

public class ejercicio12 {
    public static void main(String[] args) {
        for (var i=0; i<100; i++){
            var fila = "";
            for (var j=0; j<70; j++){
                Random rand = new Random();
                int num = rand.nextInt(36, 126);
                fila = fila + " " + String.valueOf(num);
            }
            System.out.println(fila);
        }
    }
}

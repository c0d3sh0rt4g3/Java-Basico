package Ejercicios03;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        var contadorpar= 0;
        var contadorimpar= 0;
        var par= 0;
        var impar= 0;
        while(true){
            Scanner escaner = new Scanner(System.in);
            System.out.println("Introduce un número");
            var numero = escaner.nextInt();
            if (numero<0){
                break;
            }else{
                if (numero%2==0){
                    contadorpar+=1;
                    par+=numero;
                }else{
                    contadorimpar+=1;
                    impar+=numero;
                }
            }
        }
        System.out.println("Media par = " + par/contadorpar);
        System.out.println("Media impar = " + impar/contadorimpar);
    }
}

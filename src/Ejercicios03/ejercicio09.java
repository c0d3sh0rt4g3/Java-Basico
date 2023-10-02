package Ejercicios03;

import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        var n = escaner.nextInt();
        var digitos = String.valueOf(n);
        var longitud=0;
        for (var i=0;i<=digitos.length();i++){
            longitud=i;
        }
        System.out.println(longitud + " dígito");
    }
}

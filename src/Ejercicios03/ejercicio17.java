package Ejercicios03;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        var n = escaner.nextInt();
        var total = n;
        if (n>0){
            for (var i=n; i<n+100; i++){
                System.out.println(i);
                total+=i;
            }
        }
        System.out.println(total);
    }
}

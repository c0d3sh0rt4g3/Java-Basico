package Ejercicios03;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        var n = escaner.nextInt();
        var primo = true;
        for (var i=2; i<n;i++){
            if (n%i == 0){
                primo=false;
            }
        }
        if (primo){
            System.out.println(n + "es primo");
        }else{
            System.out.println(n + "no es primo");
        }
    }
}

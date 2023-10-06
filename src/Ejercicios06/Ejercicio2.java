package Ejercicios06;

public class Ejercicio2 {
    static boolean primo(int numero) {
        var esprimo = false;
        if (numero < 2) {
            esprimo = false;
        }
        for (var i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esprimo=false;
            } else {
                esprimo=true;
            }
        }
        return esprimo;
    }
    public static void main(String[] args) {
        int numero = 3;
        if (primo(numero)){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}
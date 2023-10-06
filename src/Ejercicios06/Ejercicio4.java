package Ejercicios06;
public class Ejercicio4 {

    static int potencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponente = 6;

        System.out.println(potencia(base,exponente));
    }


}
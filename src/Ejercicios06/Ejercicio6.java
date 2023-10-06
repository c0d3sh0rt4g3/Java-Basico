package Ejercicios06;

public class Ejercicio6 {

    public static int voltear(int numero) {
        int volteado = 0;
        while(numero != 0) {
            int digito = numero % 10;
            volteado = volteado * 10 + digito;
            numero = numero / 10;
        }
        return volteado;
    }

    public static void main(String[] args) {
        int numero = 115;
        System.out.println(voltear(numero));
    }


}
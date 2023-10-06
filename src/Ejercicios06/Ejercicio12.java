package Ejercicios06;
public class Ejercicio12 {
    public static int pegarNumero(int numero, int digito){
        var cadenaNumero = String.valueOf(numero);
        var cadenaDigito = String.valueOf(digito);
        var nuevoNumero = Integer.parseInt(cadenaDigito+cadenaNumero);
        return nuevoNumero;
    }
    public static void main (String[]args){
        System.out.println(pegarNumero(12,4));
    }
}

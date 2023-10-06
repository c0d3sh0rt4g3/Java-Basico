package Ejercicios06;
public class Ejercicio14 {
    public static int juntarNumeros(int numero1, int numero2){
        var primero = String.valueOf(numero1);
        var segundo = String.valueOf(numero2);
        var nuevoNumero = Integer.parseInt(primero+segundo);
        return nuevoNumero;
    }
    public static void main (String[]args){
        System.out.println(juntarNumeros(3,5));
    }
}

package Ejercicios06;

public class Ejercicio8 {
    public static int posdigito(int numero, int digito){
        var posicion = -1;
        var cadenaNumero = String.valueOf(numero);
        char cadenaDigito = (char) (digito + '0');
        for (var i=0;i<cadenaNumero.length();i++){
            if (cadenaNumero.charAt(i)==cadenaDigito){
                posicion=i+1;
            }
        }
        return posicion;
    }
    public static void main (String[] args){
        var posicion = posdigito(23156, 5);
        System.out.println(posicion);
    }
}

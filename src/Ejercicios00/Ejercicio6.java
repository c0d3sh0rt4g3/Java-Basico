package Ejercicios00;

public class Ejercicio6 {
    public static void main(String[] args){
        float precioSinIVA = 145F;
        float IVA = 0.21F;
        float precioConIVA = (IVA * precioSinIVA) + precioSinIVA;
        System.out.println("El producto cuesta " + precioSinIVA + "€ por tanto con el IVA costará " + precioConIVA + " €");
    }
}

public class Ejercicio6 {
    public static void main(String[] args){
        float precioSinIVA = 145F;
        float precioConIVA = calculadoraIVA(precioSinIVA);
        System.out.println("El producto cuesta " + precioSinIVA + "€ por tanto con el IVA costará " + precioConIVA + " €");
    }
    public static float calculadoraIVA(float precioSinIVA){
        float IVA = 0.21F;
        return (IVA * precioSinIVA) + precioSinIVA;
    }
}

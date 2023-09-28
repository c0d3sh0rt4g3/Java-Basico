package Ejercicios00;

public class Ejercicio5 {
    public static void main(String[] args){
        float pesetas = 6000F;
        float tasaConversion = 0.0060F;
        float euros = tasaConversion * pesetas;
        System.out.println(pesetas + " pesetas serán " + euros + " euros");
    }
}

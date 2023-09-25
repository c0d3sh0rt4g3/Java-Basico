public class Ejercicio5 {
    public static void main(String[] args){
        float pesetas = 6000F;
        float euros = conversorPesetaEuro(pesetas);
        System.out.println(pesetas + " pesetas serán " + euros + " euros");
    }
    public static Float conversorPesetaEuro(float pesetas){
        float tasaConversion = 0.0060F;
        return tasaConversion * pesetas;
    }
}

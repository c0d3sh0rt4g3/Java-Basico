public class Ejercicio4 {
    public static void main(String[] args){
        float euros = 20.0F;
        Float pesetas = conversorEuroPeseta(euros);
        System.out.println(euros + " euros serán " + pesetas + " pesetas");
    }
    public static Float conversorEuroPeseta(float euros){
        float tasaConversion = 166.3860F;
        return euros * tasaConversion;
    }
}

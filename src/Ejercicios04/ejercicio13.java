package Ejercicios04;
import java.util.Random;

public class ejercicio13 {
    public static void main(String[] args) {
        var n1= 0;
        var n2=1;
            Random rand = new Random();
        while (n1!=n2){
            int dado1 = rand.nextInt(1,6);
            int dado2 = rand.nextInt(1,6);
            System.out.println(dado1 +" "+ dado2);
            n1 = dado1;
            n2 = dado2;
        }
        if (n1==n2){
            System.out.println("los dados han coincidido");
        }
    }
}

package Ejercicios04;

import java.util.Random;

public class ejercicio11 {
    public static void main(String[] args) {
        var suspensos = 0;
        var suficiente= 0;
        var bien=0;
        var notable = 0;
        var sobresaliente = 0;
        for (var i = 0;i<=20; i++){
            Random rand = new Random();
            var nota = rand.nextInt(0,10);
            System.out.println(nota);
            if (nota<5){
                suspensos+=1;
            }
            if(nota==5) {
                suficiente += 1;
            }
            if (nota==6){
                bien+=1;
            }
            if (nota==7 || nota==8){
                notable+=1;
            }
            if (nota==9 || nota==10){
                sobresaliente+=1;
            }
        }
        System.out.println("suspensos" + suspensos + "\n" + "suficietes" + suficiente + "\n" + "bien" + bien + "\n" + "notable" + notable + "\n" + "sobresaliente" + sobresaliente);
    }
}

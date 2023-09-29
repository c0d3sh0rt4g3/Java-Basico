package Ejercicios03;

public class Ejercicio6 {
    public static void main(String[] args){
        int number = 320;
        do {
            if (number % 5 == 0){
                System.out.println(number);
            }
            number -= 20;
        }while (number >= 160);
    }
}
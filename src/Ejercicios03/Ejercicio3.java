package Ejercicios03;

public class Ejercicio3 {
    public static void main(String[] args){
        int number = 0;
        do {
            if (number % 5 == 0){
                System.out.println(number);
            }
            number++;
        }while (number <= 100);
    }
}

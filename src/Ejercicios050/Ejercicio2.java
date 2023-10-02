package Ejercicios050;

public class Ejercicio2 {
    public static void main(String[] args){
        char[] symbol = new char[10];
        symbol[0] = 'a';
        symbol[1] = 'x';
        symbol[4] = '@';
        symbol[6] = ' ';
        symbol[7] = '+';
        symbol[8] = 'Q';
        for (char c : symbol) {
            System.out.println(c);
        }
    }
}

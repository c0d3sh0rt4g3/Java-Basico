package Ejercicios04;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] figure = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();
        int figureIndex = random.nextInt(4);
        int cardIndex = random.nextInt(13);

        String selectedCard = cards[cardIndex] + " de " + figure[figureIndex];

        System.out.println("Carta seleccionada: " + selectedCard);
    }
}

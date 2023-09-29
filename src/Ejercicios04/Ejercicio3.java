package Ejercicios04;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] figure = {"Espadas", "Bastos", "Oros", "Copas"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey", "As"};

        Random random = new Random();
        int figureIndex = random.nextInt(4);
        int cardIndex = random.nextInt(10);
        String selectedCard = cards[cardIndex] + " de " + figure[figureIndex];

        System.out.println("Carta seleccionada: " + selectedCard);
    }
}

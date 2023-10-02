package Ejercicios050;

import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[8];

        // Crear un array para almacenar los coloures conocidos
        String[] coloursArray = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

        int coloursCount = 0;
        int notColoursCounter = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce a word: ");
            String word = scanner.next().toLowerCase();
            words[i] = word;

            boolean knownColour = false;
            for (String colour : coloursArray) {
                if (word.equalsIgnoreCase(colour)) {
                    knownColour = true;
                    break;
                }
            }

            if (knownColour) {
                coloursCount++;
            } else {
                notColoursCounter++;
            }
        }

        String[] reorderedWords = new String[8];

        int wordsIndex = 0;
        for (int i = 0; i < coloursCount; i++) {
            reorderedWords[wordsIndex] = coloursArray[i];
            wordsIndex++;
        }

        for (String word : words) {
            boolean knownColour = false;
            for (String colour : coloursArray) {
                if (word.equals(colour)) {
                    knownColour = true;
                    break;
                }
            }
            if (!knownColour) {
                reorderedWords[wordsIndex] = word;
                wordsIndex++;
            }
        }

        System.out.println("Reordered word:");
        for (String word : reorderedWords) {
            System.out.println(word);
        }
    }
}


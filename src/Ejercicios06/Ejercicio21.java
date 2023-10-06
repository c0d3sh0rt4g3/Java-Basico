package Ejercicios06;

public class Ejercicio21 {

    private static int minIntArray(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty.");
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 12, 67, 3, 21, 8};

        try {
            int minValue = minIntArray(numbers);
            System.out.println("The minimum value in the array is: " + minValue);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

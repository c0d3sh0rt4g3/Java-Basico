package Ejercicios06;

public class Ejercicio23 {

    public static double averageIntArray(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty.");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 12, 67, 3, 21, 8};

        try {
            double average = averageIntArray(numbers);
            System.out.println("The average of the array is: " + average);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


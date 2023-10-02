package Ejercicios051;
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][12];
        fillMatrixWithRandomNumbers(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateMatrixClockwise(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
    }

    public static void fillMatrixWithRandomNumbers(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(101);
            }
        }
    }

    public static void rotateMatrixClockwise(int[][] matrix) {
        int n = matrix.length;
        int[][] tempMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tempMatrix[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = tempMatrix[n - 1 - j][i];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}

package arrays;

import java.util.Arrays;

public class ArraysCh04 {
    public static void main(String[] args) {
        int[][] matrixA = {
                {2, 5},
                {6, 7},
                {1, 8},
        };

        int[][] matrixB = {
                {1, 2, 1},
                {0, 1, 0},
        };

        var multipliedMatrix = multiply(matrixA, matrixB);

        System.out.println(Arrays.deepToString(multipliedMatrix)); // =>
// [
//   [2, 9, 2],
//   [6, 19, 6],
//   [1, 10, 1],
// ]

    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int[][] result = new int[rows][cols];
        for (int i=0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
}

/*
public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        var rowsCountA = matrixA.length;
        var rowsCountB = matrixB.length;
        var columnsCountB = matrixB[0].length;
        var multipliedMatrix = new int[rowsCountA][0];

        for (var row = 0; row < rowsCountA; row++) {
            multipliedMatrix[row] = new int[columnsCountB];
            for (var column = 0; column < columnsCountB; column++) {
                var sum = 0;
                for (var i = 0; i < rowsCountB; i++) {
                    sum += matrixA[row][i] * matrixB[i][column];
                }
                multipliedMatrix[row][column] = sum;
            }
        }

        return multipliedMatrix;
    }
 */

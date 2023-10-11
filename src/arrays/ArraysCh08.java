package arrays;

import java.util.Arrays;

public class ArraysCh08 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        var result = buildSnailPath(matrix);
        System.out.println(Arrays.toString(result));
// => [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }

    public static int[] buildSnailPath(int[][] matr) {
        if (matr.length == 0 || matr == null) {
            int[] emptyResult = {};
            return emptyResult;
        }
        int[] result = new int[matr.length * matr[0].length];
        int curLen = 0;
        while (curLen < result.length) {
            System.arraycopy(matr[0], 0, result, curLen, matr[0].length);
            curLen += matr[0].length;
            if (matr.length != 1) {
                matr = rotateLeft(removeFirstRow(matr));
            }
        }
        return result;
    }

    public static int[][] rotateLeft(int[][] matr) {
        int rows = matr.length;
        int cols = matr[0].length;
        int index = cols - 1;
        int newIndex = 0;
        int[][] result = new int[cols][rows];
        for (int[] row : result) {
            result[newIndex] = getCol(matr, index);
            index--;
            newIndex++;
        }
        return result;
    }

    public static int[] getCol(int[][] matr, int num) {
        int[] result = new int[matr.length];
        for (int i = 0; i < matr.length; i++) {
            result[i] = matr[i][num];
        }
        return result;
    }

    public static int[][] removeFirstRow(int[][] matrix) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length;
        int[][] cuttedMatrix = new int[rows][cols];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < cols; j++) {
                cuttedMatrix[i - 1][j] = matrix[i][j];
            }
        }
        return cuttedMatrix;
    }
}

/*
public static int[][] rotate(int[][] matrix) {
        var rowsCount = matrix.length;

        if (rowsCount == 0) {
            return new int[0][0];
        }

        var columnsCount = matrix[0].length;
        var rotatedMatrix = new int[columnsCount][rowsCount];

        for (var row = 0; row < columnsCount; row++) {
            rotatedMatrix[row] = new int[rowsCount];
            for (var column = 0; column < rowsCount; column++) {
                rotatedMatrix[row][column] = matrix[column][columnsCount - row - 1];
            }
        }
        return rotatedMatrix;
    }

    public static int[] buildSnailPath(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        var head = matrix[0];
        var tail = Arrays.copyOfRange(matrix, 1, matrix.length);

        int[][] result = {
            head,
            buildSnailPath(rotate(tail)),
        };

        return flatten(result);
    }
 */

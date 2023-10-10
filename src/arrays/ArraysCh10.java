package arrays;

import java.util.Arrays;

public class ArraysCh10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
        };
        var rotatedLeft = rotateLeft(matrix);
        System.out.println(Arrays.deepToString(rotatedLeft)); // =>
// [
//   [4, 8, 2],
//   [3, 7, 1],
//   [2, 6, 0],
//   [1, 5, 9],
// ]
        var rotatedRight = rotateRight(matrix);
        System.out.println(Arrays.deepToString(rotatedRight)); // =>
// [
//   [9, 5, 1],
//   [0, 6, 2],
//   [1, 7, 3],
//   [2, 8, 4],
// ]
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

    public static int[][] rotateRight(int[][] matr) {
        int rows = matr.length;
        int cols = matr[0].length;
        int index = 0;
        int newIndex = 0;
        int[][] result = new int[cols][rows];
        for (int[] row : result) {
            result[newIndex] = rotateLine(getCol(matr, index));
            index++;
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

    public static int[] rotateLine(int[] line) {
        int[] result = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            result[i] = line[line.length - 1 - i];
        }
        return result;
    }
}

/*
public static int[][] rotate(int[][] matrix, String direction) {
        var rowsCount = matrix.length;
        var columnsCount = matrix[0].length;
        var rotatedMatrix = new int[columnsCount][rowsCount];

        for (var row = 0; row < columnsCount; row++) {

            rotatedMatrix[row] = new int[rowsCount];

            for (var coll = 0; coll < rowsCount; coll++) {
                rotatedMatrix[row][coll] = direction.equals("left")
                    ? matrix[coll][columnsCount - row - 1]
                    : matrix[rowsCount - coll - 1][row];
            }
        }

        return rotatedMatrix;
    }

    public static int[][] rotateLeft(int[][] matrix) {
        return rotate(matrix, "left");
    }

    public static int[][] rotateRight(int[][] matrix) {
        return rotate(matrix, "right");
    }
 */
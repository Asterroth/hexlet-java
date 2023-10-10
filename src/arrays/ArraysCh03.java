package arrays;

import java.util.Arrays;

public class ArraysCh03 {
    public static void main(String[] args) {
        int[][] matrix = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
        };

        var mirroredMatrix = getMirrorMatrix(matrix);
        System.out.println(Arrays.deepToString(mirroredMatrix)); //=>
// [
//     [11, 12, 12, 11],
//     [21, 22, 22, 21],
//     [31, 32, 32, 31],
//     [41, 42, 42, 41],
//  ]
    }

    public static int[][] getMirrorMatrix(int[][] matr) {
        int index = matr.length - 1;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length / 2; j++) {
                matr[i][index - j] = matr[i][j];
            }
        }
        return matr;
    }
}

/*
public static int[] getMirrorRow(int[] row) {
        var size = row.length;
        var mirroredRow = new int[size];

        for (var i = 0; i < size / 2; i++) {
            mirroredRow[i] = row[i];
            mirroredRow[size - i - 1] = row[i];
        }

        return mirroredRow;
    }

    public static int[][] getMirrorMatrix(int[][] matrix) {
        var size = matrix.length;
        var mirroredMatrix = new int[size][size];

        var index = 0;
        for (var row : matrix) {
            var mirroredRow = getMirrorRow(row);
            mirroredMatrix[index] = mirroredRow;
            index++;
        }

        return mirroredMatrix;
    }
 */

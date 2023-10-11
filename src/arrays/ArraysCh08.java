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

    public static int[] buildSnailPath(int[][] matrix) {
        int size = matrix.length;
        int columns = matrix[0].length;
        int[] result = new int[size * columns];
        int currentRow = 0, currentColumn = 0;

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] line = {};
        int[][] newMatrix = rotateLeft(removeFirstRow(matrix));
        System.out.println(Arrays.deepToString(newMatrix));
        System.out.println(Arrays.toString(addFirstRow(line, newMatrix)));
    }

    public static int[] buildSnailPath(int[][] matrix) {

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

    public static int[] addFirstRow(int[] line, int[][] matrix) {
        int newLength = line.length + matrix[0].length;
        int[] result = new int[newLength];
        System.arraycopy(line, 0, result, 0, line.length);
        if (result.length - line.length >= 0)
            System.arraycopy(matrix[0], 0, result, line.length, result.length - line.length);
        return result;
    }

    public static int[] flatten(int[][] matrix) {
        var rowsCount = matrix.length;
        if (rowsCount == 0) {
            return new int[0];
        }
        var columnsCount = matrix[0].length;
        // Определяем, какое количество элементов будет в массиве-результате
        var elementsCount = rowsCount * columnsCount;
        // Инициализируем массив-результат
        int[] elements = new int[elementsCount];
        var index = 0;
        // Проходим по основному массиву
        for (var row: matrix) {
            // Проходим по вложенному массиву
            for (var element: row) {
                // Добавляем каждый элемент в массив-результат
                elements[index] = element;
                index++;
            }
        }
        // Возвращаем массив результат
        return elements;
    }}


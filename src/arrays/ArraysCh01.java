// МОРСКОЙ БОЙ
package arrays;

public class ArraysCh01 {
    public static void main(String[] args) {
        int[] row1 =  {1, 0, 0, 1, 0, 1, 1, 1, 0, 1};
        int[] row2 =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] row3 =  {0, 0, 0, 1, 1, 0, 0, 0, 0, 1};
        int[] row4 =  {1, 0, 0, 0, 0, 0, 0, 1, 0, 0};
        int[] row5 =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row6 =  {1, 0, 0, 1, 0, 0, 0, 0, 0, 0};
        int[] row7 =  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row8 =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row9 =  {1, 0, 0, 0, 1, 0, 0, 0, 0, 0};
        int[] row10 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //System.out.println(countInLine(row1));
        //System.out.println(checkLine(row1, row2));
        int[][] field = new int[10][10];
        fillField(0, field, row1);
        fillField(1, field, row2);
        fillField(2, field, row3);
        fillField(3, field, row4);
        fillField(4, field, row5);
        fillField(5, field, row6);
        fillField(6, field, row7);
        fillField(7, field, row8);
        fillField(8, field, row9);
        fillField(9, field, row10);
        //System.out.println(Arrays.deepToString(field));
        System.out.println(isValidField(field));

        int[][] battleField1 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 0},
        };

        int[][] battleField2 = {
                {0, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 1},
        };
        System.out.println(isValidField(battleField1));
        System.out.println(isValidField(battleField2));
        System.out.println(calcShipsCount2(battleField1));
        System.out.println(calcShipsCount2(battleField2));
        System.out.println(calcShipsCount2(field));
    }
    public static int countInLine (int[] line) {
        int count = 0;
        if (line[0] == 1) {
            count++;
        }
        for (int i = 1; i < line.length; i++) {
            if (line[i - 1] == 0 && line[i] == 1) {
                count++;
            }
        }
        return count;
    }
    public static boolean checkLine (int[] line1, int[] line2) {
        if (line2[0] == 1 && line1[1] == 1) {
            return false;
        }
        for (int i = 1; i < line1.length - 1; i++) {
            if (line2[i] == 1 && (line1[i - 1] == 1 || line1[i + 1] == 1)) {
                return false;
            }
        }
        if (line2[line2.length - 1] == 1 && line1[line1.length - 2] == 1) {
            return false;
        }
        return true;
    }

    public static void fillField (int r, int[][] field, int[] row) {
        int k = 0;
        for (int val : row) {
            field[r][k] = row[k];
            k++;
        }
    }

    public static boolean isValidField (int[][] field) {
        for (int i = 1; i < field.length; i++) {
            if (field[i][0] == 1 && field[i - 1][1] == 1) {
                return false;
            }
            for (int j = 1; j < field.length - 1; j++) {
                if (field[i][j] == 1 && (field[i - 1][j - 1] == 1 || field[i - 1][j + 1] == 1)) {
                    return false;
                }
            }
            if (field[i][field.length - 1] == 1 && field[i - 1][field.length - 2] == 1) {
                return false;
            }
        }
        return true;
    }

    public static int calcShipsCount(int[][] field) {
        int count = 0;
        if (field.length == 0) {
            return count;
        }
        if (field[0][0] == 1) {
            count++;
        }
        for (int k = 1; k < field.length; k++) {
            if (field[0][k - 1] == 0 && field[0][k] == 1) {
                count++;
            }
        }

        for (int i = 1; i < field.length; i++){
            if (field[i][0] == 1 && field[i - 1][0] != 1) {
                count++;
            }
            for (int j = 1; j < field.length; j++) {
                if (field[i][j - 1] == 0 && field[i][j] == 1 && field[i - 1][j] != 1) {
                    count++;
                }
            }
        }
        return count;
    }

    /////// РЕШЕНИЕ ПРЕПОДАВАТЕЛЯ
    public static int calcShipsCount2(int[][] battleField) {
        var shipsCount = 0;
        var fieldSize = battleField.length;

        for (var row = 0; row < fieldSize; row++) {
            for (var col = 0; col < fieldSize; col++) {
                if (battleField[row][col] == 1 && (col == 0 || battleField[row][col - 1] == 0)) {
                    if (row == 0 || battleField[row - 1][col] == 0) {
                        shipsCount++;
                    }
                }
            }
        }

        return shipsCount;
    }

    public static boolean isValidField2(int[][] battleField) {
        var fieldSize = battleField.length;

        for (var col = 0; col < fieldSize; col++) {
            for (var row = 1; row < fieldSize; row++) {
                if (battleField[row][col] == 1) {
                    if (col < fieldSize - 1 && battleField[row - 1][col + 1] == 1
                            || (col != 0 && battleField[row - 1][col - 1] == 1)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

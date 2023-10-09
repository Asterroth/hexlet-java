// МОРСКОЙ БОЙ
//package arrays;

public class ArraysCh01 {
    public static void main(String[] args) {
        int[] row1 = {1, 0, 1, 1, 1, 1, 1, 1, 0, 1};
        int[] row2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        System.out.println(countInLine(row1));
        System.out.println(checkLine(row1, row2));
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
        return true;
    }
}

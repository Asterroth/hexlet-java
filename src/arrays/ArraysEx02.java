package arrays;

import java.util.Arrays;

public class ArraysEx02 {
    public static void main(String[] args) {
        int[] numbers1 = {2};
        int[] numbers2 = {1, 2, 6, 99};
        System.out.println(Arrays.toString(swap(numbers_1)));
        System.out.println(Arrays.toString(swap(numbers_2)));
    }

    public static int[] swap(int[] numbers) {
        // BEGIN (write your solution here)
        if (numbers.length < 2) {
            return numbers;
        } else {
            int firstElement = numbers[0];
            int lastElement = numbers[numbers.length - 1];
            numbers[0] = lastElement;
            numbers[numbers.length - 1] = firstElement;
            return numbers;
        }
        // END
    }
}

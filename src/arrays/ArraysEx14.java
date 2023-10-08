package arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ArraysEx14 {
    public static void main(String[] args) {
        int[] numbers1 = {10, 11, 24, 24};
        int[] numbers2 = {10, 10, 13, 14, 18, 24, 30};
        var result1 = ArraysEx14.getIntersectionOfSortedArrays(numbers1, numbers2);
        System.out.println(Arrays.toString(result1)); // => [10, 24]

        int[] numbers3 = {10, 11, 24};
        int[] numbers4 = {-2, 3, 4};
        var result2 = ArraysEx14.getIntersectionOfSortedArrays(numbers3, numbers4);
        System.out.println(Arrays.toString(result2)); // => []

        int[] numbers5 = {0, 0, 5, 11, 12, 13, 15};
        int[] numbers6 = {0, 0, 5};
        var result3 = ArraysEx14.getIntersectionOfSortedArrays(numbers5, numbers6);
        System.out.println(Arrays.toString(result3));
    }

    public static int[] getIntersectionOfSortedArrays(int[] arrayA, int[] arrayB) {
        int resultLength = Math.min(arrayA.length, arrayB.length);
        int[] result = new int[resultLength];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] == arrayB[j]) {
                if (arrayA[i] == 0 && k == 0) {
                    k++;
                } else if (!ArrayUtils.contains(result, arrayA[i])) {
                    result[k] = arrayA[i];
                    k++;
                }
                i++;
                j++;
            } else if (arrayA[i] < arrayB[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(result, k);
    }
}

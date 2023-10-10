package arrays;

public class ArraysCh06 {
    public static void main(String[] args) {
        int[] numbers1 = {10, 11, 12, 13};
        System.out.println(isContinuousSequence(numbers1)); // true
        int[] numbers2 = {-5, -4, -3};
        System.out.println(isContinuousSequence(numbers2)); // true
        int[] numbers3 = {10, 11, 12, 14};
        System.out.println(isContinuousSequence(numbers3)); // false
        int[] numbers4 = {1, 2, 2, 3};
        System.out.println(isContinuousSequence(numbers4)); // false
        int[] numbers5 = {5};
        System.out.println(isContinuousSequence(numbers5)); // false
        int[] numbers6 = {};
        System.out.println(isContinuousSequence(numbers6)); // false
    }

    public static boolean isContinuousSequence(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return false;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if ((array[i + 1] - array[i]) != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
public static boolean isContinuousSequence(int[] numbers) {
        var length = numbers.length;

        if (length <= 1) {
            return false;
        }

        var first = numbers[0];

        for (var i = 1; i < length; i++) {
            if (first + i != numbers[i]) {
                return false;
            }
        }

        return true;
    }
 */

package arrays;

import java.util.Arrays;

//Реализуйте публичный статический метод generate(), который возвращает
// указанную строку треугольника Паскаля в виде массива целых чисел.
public class ArraysCh02 {
    public static void main(String[] args) {
        var result = ArraysCh02.generate(9);
        System.out.println(Arrays.toString(result)); // => [1, 4, 6, 4, 1]
    }

    public static int[] generate(int s) {
        int[] result = new int[s + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = factorial(s) / (factorial(i) * factorial(s - i));
        }
        return result;
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}

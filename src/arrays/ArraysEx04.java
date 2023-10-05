/*
Реализуйте публичный статический метод calculateSum(), который принимает в качестве аргумента массив целых чисел.
Метод высчитывает и возвращает сумму всех элементов массива, которые делятся без остатка на 3 (три).
В случае пустого массива метод должен вернуть 0.

int[] numbers = {8, 9, 21, 19, 18, 22, 7};
App.calculateSum(numbers); // 48
 */
package arrays;

public class ArraysEx04 {
    public static void main(String[] args) {
        int[] numbers1 = {8, 9, 21, 19, 18, 22, 7};
        int[] numbers2 = {};
        System.out.println(ArraysEx04.calculateSum(numbers1)); // 48
        System.out.println(ArraysEx04.calculateSum(numbers2));
    }

    public static int calculateSum(int[] nums) {
        var sum = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}
/*
Решение преподавателя

public static int calculateSum(int[] numbers) {
        var sum = 0;

        for (var i = 0; i < numbers.length; i++) {
            var number = numbers[i];
            if (number % 3 == 0) {
                sum += number;
            }
        }

        return sum;
    }
 */
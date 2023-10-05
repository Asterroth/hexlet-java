/*
Реализуйте публичный статический метод mult(), который принимает на вход массив целых чисел
и возвращает произведение всех элементов массива.

int[] numbers1 = {1, 4, 3, 4, 5};
App.mult(numbers1); // 240

int[] numbers2 = {1, 4, -3, 2};
App.mult(numbers2); // -24

int[] numbers3 = {1, -3, 5, 4, -3, 0};
App.mult(numbers3); // 0
 */
package arrays;

public class ArraysEx05 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 4, 3, 4, 5};
        System.out.println(ArraysEx05.mult(numbers1)); // 240

        int[] numbers2 = {1, 4, -3, 2};
        System.out.println(ArraysEx05.mult(numbers2)); // -24

        int[] numbers3 = {1, -3, 5, 4, -3, 0};
        System.out.println(ArraysEx05.mult(numbers3)); // 0
    }

    public static int mult(int[] nums) {
        var product = 1;
        for (var value : nums) {
            product *= value;
        }
        return product;
    }
}

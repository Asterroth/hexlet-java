/*
Реализуйте публичный статический метод getSameParity(), который принимает на вход массив чисел
и возвращает новый, состоящий из элементов, у которых такая же чётность, как и у первого элемента входного массива.
Если на вход был передан пустой массив, метод возвращает также пустой массив.

int[] numbers1 = {};

App.getSameParity(numbers1); // []



int[] numbers2 = {1, 2, 3};

App.getSameParity(numbers2); // [1, 3]



int[] numbers3 = {1, 2, 8};

App.getSameParity(numbers3); // [1]



int[] numbers4 = {2, 2, 8};

App.getSameParity(numbers4); // [2, 2, 8]



int[] numbers5 = {-3, 2, 1};

App.getSameParity(numbers5); // [-3, 1]

Подсказки

    Проверку чётности можно выполнить используя остаток от деления на 2: item % 2 == 0
    В массиве могут находится отрицательные числа. Для работы с ними вам может понадобиться
    метод нахождения модуля Math.abs()

  Math.abs(-1); // 1

  Math.abs(1); // 1

  Math.abs(0); // 0

    Так как мы не знаем заранее, какое количество элементов будет в новом массиве,
    можно изначально создать массив с "запасом", а затем отрезать лишнее.
    Для этого может понадобиться метод Arrays.copyOfRange(),
    который принимает на вход массив чисел и возвращает часть его элементов в виде нового массива:

int[] numbers = {3, 7, 8, 9, 2, 1};

// получаем элементы с 1-го индекса включительно по 4-й не включительно

var range = Arrays.copyOfRange(numbers, 0, 4);

System.out.println(Arrays.toString(range));

    // => [3, 7, 8, 9]


 */
package arrays;

import java.util.Arrays;

public class ArraysEx06 {
    public static void main(String[] args) {
        int[] numbers1 = {};
        System.out.println(Arrays.toString(ArraysEx06.getSameParity(numbers1))); // []

        int[] numbers2 = {1, 2, 3};
        System.out.println(Arrays.toString(ArraysEx06.getSameParity(numbers2))); // [1, 3]

        int[] numbers3 = {1, 2, 8};
        System.out.println(Arrays.toString(ArraysEx06.getSameParity(numbers3))); // [1]

        int[] numbers4 = {2, 2, 8};
        System.out.println(Arrays.toString(ArraysEx06.getSameParity(numbers4))); // [2, 2, 8]

        int[] numbers5 = {-3, 2, 1};
        System.out.println(Arrays.toString(ArraysEx06.getSameParity(numbers5))); // [-3, 1]
    }

    public static int[] getSameParity(int[] nums) {
        if (nums.length == 0) {
            int[] result = {};
            return result;
        }
        int[] oddResult = new int[nums.length];
        int[] evenResult = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int value : nums) {
            if (Math.abs(value) % 2 == 0) {
                evenResult[evenIndex] = value;
                evenIndex++;
            } else {
                oddResult[oddIndex] = value;
                oddIndex++;
            }
        }
        if(nums[0] % 2 == 0) {
            return Arrays.copyOfRange(evenResult, 0, evenIndex);
        } else {
            return Arrays.copyOfRange(oddResult, 0, oddIndex);
        }
    }
}
/*
Решение препода

class App {
    // BEGIN
    public static int[] getSameParity(int[] numbers) {
        var numbersCount = numbers.length;

        // Если на вход передан пустой массив, возвращаем пустой массив
        if (numbersCount == 0) {
            return new int[0];
        }

        // Определяем чётность первого элемента массива
        // Так как в массиве могут находится отрицательные числа,
        // вычисляем абсолютное значение остатка от деления числа на 2
        var remainder = Math.abs(numbers[0] % 2);

        // Так как мы не знаем, сколько элементов будет в итоговом массиве,
        // сначала создаём массив с количеством элементов, равным исходному.
        // Лишнее потом отрежем
        var items = new int[numbersCount];
        var index = 0;
        // Проверяем каждый элемент массива
        for (var number : numbers) {
            // Чтобы понять, что текущий элемент имеет такую же чётность, что и первый элемент
            // будем сравнивать модуль остатка от деления текущего элемента
            // с модулем остатка от деления первого элемента
            if (Math.abs(number % 2) == remainder) {
                // Если элемент имеет такую же чётность, добавляем его в итоговый массив
                items[index] = number;
                index++;
            }
        }

        // Убираем лишние элементы массива,
        // которые мы не заполнили значениями из исходного
        return Arrays.copyOfRange(items, 0, index);
    }
    // END
 */

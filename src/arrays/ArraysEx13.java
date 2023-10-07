/*
Реализуйте публичный статический метод bubbleSort(), который сортирует переданный массив целых чисел,
используя алгоритм пузырьковой сортировки. Метод изменяет переданный массив.
Постарайтесь не подглядывать в текст теории и попробуйте воспроизвести алгоритм по памяти.

int[] numbers1 = {};
App.bubbleSort(numbers1);
System.out.println(Arrays.toString(numbers1)); // => []

int[] numbers2 = {3, 10, 4, 3};
App.bubbleSort(numbers2);
System.out.println(Arrays.toString(numbers2)); // => [3, 3, 4, 10]
 */

package arrays;
import java.util.*;
public class ArraysEx13 {
    public static void main(String[] args) {
        int[] numbers1 = {};
        ArraysEx13.bubbleSort(numbers1);
        System.out.println(Arrays.toString(numbers1)); // => []

        int[] numbers2 = {3, 10, 4, 3};
        ArraysEx13.bubbleSort(numbers2);
        System.out.println(Arrays.toString(numbers2)); // => [3, 3, 4, 10]
    }

    public static void bubbleSort(int[] inpArr) {
        var stepsCount = inpArr.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (var i = 0; i < stepsCount; i++) {
                if (inpArr[i] > inpArr[i + 1]) {
                    var temp = inpArr[i];
                    inpArr[i] = inpArr[i + 1];
                    inpArr[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
    }
}

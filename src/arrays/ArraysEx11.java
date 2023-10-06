package arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

public class ArraysEx11 {
    public static void main(String[] args) {
        // Общие уникальные элементы: 1, 3, 2
        System.out.println(ArraysEx11.getSameCount(new int[] {1, 3, 2, 2}, new int[] {3, 1, 1, 2, 5})); // 3
// Общие уникальные элементы: 4
        System.out.println(ArraysEx11.getSameCount(new int[] {1, 4, 4}, new int[] {4, 8, 4})); // 1
// Общие уникальные элементы: 1, 10
        System.out.println(ArraysEx11.getSameCount(new int[] {1, 10, 3}, new int[] {10, 100, 35, 1})); // 2
// Нет элементов
        System.out.println(ArraysEx11.getSameCount(new int[] {}, new int[] {})); // 0
    }

    public static int getSameCount (int[] array1, int[] array2) {
        int[] uniqueArr1 = ArraysEx11.unique(array1);
        int[] uniqueArr2 = ArraysEx11.unique(array2);
        int count = 0;
        for (int item : uniqueArr1) {
            if (ArrayUtils.contains(uniqueArr2, item)) {
                count++;
            }
        }
        return count;
    }

    public static int[] unique(int[] array) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i : array) {
            uniqueValues.add(i);
        }
        int[] uniqueArray = new int[uniqueValues.size()];
        int index = 0;
        for (int value : uniqueValues) {
            uniqueArray[index++] = value;
        }
        return uniqueArray;
    }
}

/*
Решение преподавателя

public static int getSameCount(int[] coll1, int[] coll2) {
        var uniq1 = Utils.uniq(coll1);
        var uniq2 = Utils.uniq(coll2);

        var count = 0;

        for (var item1 : uniq1) {
            for (var item2 : uniq2) {
                if (item1 == item2) {
                    count++;
                }
            }
        }

        return count;
    }
 */
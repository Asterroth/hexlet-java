package arrays;

import java.util.Arrays;

public class ArraysCh07 {
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four", "five", "six", "seven"};
        var chunks1 = chunk(words, 2);
        System.out.println(Arrays.deepToString(chunks1));
// => [["one", "two"], ["three", "four"]]
        var chunks2 = chunk(words, 3);
        System.out.println(Arrays.deepToString(chunks2));
        // => [["one", "two", "three"], ["four"]]

    }

    public static String[][] chunk(String[] s, int n) {
        int rows = 0;
        boolean tail = false;
        if (s.length % n == 0) {
            rows = s.length / n;
        } else {
            rows = s.length / n + 1;
            tail = true;
        }
        String[][] result = new String[rows][];
        if (!tail) {
            for (int i = 0; i < result.length; i++) {
                result[i] = Arrays.copyOfRange(s, n * i, n * i + n);
            }
        } else {
            int tailValue = s.length % n;
            for (int i = 0; i < result.length; i++) {
                result[i] = Arrays.copyOfRange(s, n * i, n * i + n);
            }
            result[result.length - 1] = Arrays.copyOfRange(s, s.length - tailValue, s.length);
        }
        return result;
    }
}

/*
public static String[][] chunk(String[] words, int size) {

        var wordsCount = words.length;
        var chunksCount = (int) Math.ceil((double) wordsCount / size);
        var chunks = new String[chunksCount][0];
        var index = 0;

        for (var i = 0; i < wordsCount; i += size) {
            var to = i + size > wordsCount ? wordsCount : i + size;
            chunks[index] = Arrays.copyOfRange(words, i, to);
            index++;
        }
        // System.out.println(Arrays.deepToString(result));

        return chunks;
    }
 */
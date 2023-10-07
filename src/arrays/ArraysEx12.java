/*
Реализуйте публичный статический метод countUniqChars(), который принимает на вход строку и считает,
сколько символов (без учёта повторяющихся символов) использовано в этой строке.
Например, в строке "yy" используется всего один символ — 'y'.
А в строке "111yya!" — используется четыре символа: '1', 'y', 'a' и '!'.

var text1 = "yyab";
App.countUniqChars(text1); // 3

var text2 = "You know nothing Jon Snow";
App.countUniqChars(text2); // 13

var text3 = "";

App.countUniqChars(text3); // 0

Подсказки

    Чтобы разбить строку на массив символов, можно использовать метод строк toCharArray()
    Для проверки вхождения значения в массив используйте метод ArrayUtils.contains()
 */

package arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArraysEx12 {
    public static void main(String[] args) {
        var text1 = "yyab";
        System.out.println(ArraysEx12.countUniqChars(text1)); // 3

        var text2 = "You know nothing Jon Snow";
        System.out.println(ArraysEx12.countUniqChars(text2)); // 13

        var text3 = "";

        System.out.println(ArraysEx12.countUniqChars(text3)); // 0
    }

    public static int countUniqChars(String text) {
        int result = 0;
        var uniq = new char[text.length()];
        var charsArr = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (!ArrayUtils.contains(uniq, charsArr[i])) {
                uniq[i] = charsArr[i];
                result++;
            }
        }
        return result;
    }
}

package arrays;

//Реализуйте публичный статический метод getLastWordLength(),
// который возвращает длину последнего слова переданной на вход строки.
// Словом считается любая последовательность, не содержащая пробелов.
public class ArraysCh05 {
    public static void main(String[] args) {
        System.out.println(ArraysCh05.getLastWordLength("")); // 0
        System.out.println(ArraysCh05.getLastWordLength("man in BlacK")); // 5
        System.out.println(ArraysCh05.getLastWordLength("hello, world!  ")); // 6
    }

    public static int getLastWordLength(String str) {
        String[] strArray = str.trim().split(" ");
        return strArray[strArray.length - 1].length();
    }
}

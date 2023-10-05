package arrays;
import java.util.Arrays;
public class ArraysEx03 {
    public static void main(String[] args) {
        String[] names = {"John", "Smit", "Karl"};
        var namesWithPrefix = ArraysEx03.addPrefix(names, "Mr.");
        System.out.println(Arrays.toString(namesWithPrefix));
// => ["Mr. John", "Mr. Smit", "Mr. Karl"]

        System.out.println(Arrays.toString(names)); // Исходный массив не меняется
// => ["John", "Smit", "Karl"]
    }

    public static String[] addPrefix(String[] names, String prefix) {
        String[] namesWithPrefix = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            namesWithPrefix[i] = prefix + " " + names[i];
        }
        return namesWithPrefix;
    }
}

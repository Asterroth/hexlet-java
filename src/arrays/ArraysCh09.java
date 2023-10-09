package arrays;
//Реализуйте публичный статический метод getHammingWeight(),
// который считает и возвращает вес Хэмминга. Метод принимает в качестве аргумента целое число.
public class ArraysCh09 {
    public static void main(String[] args) {
        System.out.println(ArraysCh09.getHammingWeight(0)); // 0
        System.out.println(ArraysCh09.getHammingWeight(4)); // 1
        System.out.println(ArraysCh09.getHammingWeight(101)); // 4
    }

    public static int getHammingWeight(int a) {
        String arr = Integer.toBinaryString(a);
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}

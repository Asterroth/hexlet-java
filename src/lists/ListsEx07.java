package lists;

import java.util.LinkedList;

public class ListsEx07 {
    public static void main(String[] args) {
        System.out.println(isBracketsBalanced("()")); // true
        System.out.println(isBracketsBalanced("()()")); // true
        System.out.println(isBracketsBalanced("(()())")); // true

        System.out.println(isBracketsBalanced("(")); // false
        System.out.println(isBracketsBalanced("(()")); // false
        System.out.println(isBracketsBalanced(")(")); // false
        System.out.println();
        System.out.println(isBracketsBalanced("")); // true
        System.out.println(isBracketsBalanced("()")); // true
        System.out.println(isBracketsBalanced("()()()")); // true
        System.out.println(isBracketsBalanced("(())")); // true
        System.out.println(isBracketsBalanced("(()()())")); // true
        System.out.println(isBracketsBalanced("(()")); // false
        System.out.println(isBracketsBalanced("())()")); // false
        System.out.println(isBracketsBalanced(")(")); // false
        System.out.println(isBracketsBalanced("(()()")); // false
    }

    public static boolean isBracketsBalanced(String str) {
        var result = new LinkedList<>();
        for (var ch : str.toCharArray()) {
            if (ch == '(') {
                result.add(ch);
            } else if (ch == ')' && !result.isEmpty()) {
                result.pollLast();
            } else {
                result.add(ch);
            }
        }
        return result.isEmpty();
    }
}

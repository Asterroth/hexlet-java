package OOP;
import org.apache.commons.lang3.StringUtils;
public class OOP_Ex06 {
    public static void main(String[] args) {
        System.out.println(App.isPalindrome("шалаш")); // true
        System.out.println(App.isPalindrome("ага")); // true
        System.out.println(App.isPalindrome("хекслет")); // false

// Слова в метод могут быть переданы в любом регистре
        System.out.println(App.isPalindrome("Ага")); // true
    }


}

class App {
    public static boolean isPalindrome(String str) {
        //String newStr = new StringBuilder(str).reverse().toString();
        String newStr = StringUtils.reverse(str);
        return str.equalsIgnoreCase(newStr);
    }
}

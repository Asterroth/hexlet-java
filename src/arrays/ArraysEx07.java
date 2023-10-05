package arrays;

public class ArraysEx07 {
    public static void main(String[] args) {
        String[] banknotes1 = {"eur 10", "usd 1", "usd 10", "rub 50", "usd 5"};
        System.out.println(ArraysEx07.getTotalAmount(banknotes1, "usd")); // 16

        String[] banknotes2 = {"eur 10", "usd 1", "eur 5", "rub 100", "eur 20", "eur 100", "rub 200"};
        System.out.println(ArraysEx07.getTotalAmount(banknotes2, "eur")); // 135

        String[] banknotes3 = {"eur 10", "rub 50", "eur 5", "rub 10", "rub 10", "eur 100", "rub 200"};
        System.out.println(ArraysEx07.getTotalAmount(banknotes3, "rub")); // 270
    }

    public static int getTotalAmount(String[] wallet, String currency) {
        int amount = 0;
        for (var value : wallet) {
            if (!value.substring(0, 3).equals(currency)) {
                continue;
            }
            amount = amount + Integer.parseInt(value.substring(4));
        }
        return amount;
    }
}

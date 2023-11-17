package maps;

import java.util.HashMap;
import java.util.Map;

public class MapsEx01 {
    private static Map<String, Double> products = Data.getProducts();
    public static void main(String[] args) {
        //var products = Map.of(
        //        "Coffee", 30.0,
        //       "Bread", 10.0,
        //        "Milk", 20.0
        //);

        var discounts = Map.of(
                "Bread", 10.0,
                "Salmon", 20.0
        );

// Скидка на хлеб 10 процентов
        System.out.println(getPriceWithDiscount(discounts, "Chicken")); // 9.0
// На молоко сегодня скидок нет
        System.out.println(getPriceWithDiscount(discounts, "Salmon")); // 20.0
        System.out.println(getPriceWithDiscount(discounts, "Olives")); // null
    }

    public static Double getPriceWithDiscount(Map<String, Double> discounts, String product) {
        if (!products.containsKey(product)) {
            return null;
        } else if (!discounts.containsKey(product)) {
            return products.get(product);
        } else {
            return (1 - discounts.get(product) / 100) * products.get(product);
        }
    }
}

class Data {
    public static Map<String, Double> getProducts() {
        var products = new HashMap<String, Double>();

        products.put("Coffee", 22.0);
        products.put("Lychee", 31.0);
        products.put("Salmon", 27.0);
        products.put("Salt", 5.0);
        products.put("Shrimp", 45.0);
        products.put("Strawberries", 15.0);
        products.put("Water", 7.0);
        products.put("Tomatoes", 46.0);
        products.put("Chicken", 50.0);

        return products;
    }
}

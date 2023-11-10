package lists;

import java.util.ArrayList;
import java.util.List;

class ListsEx03 {
    public static void main(String[] args) {
        var products = List.of(
                new Product("bread", 5),
                new Product("milk", 10),
                new Product("fish", 30)
        );

        var result = getProductsByPrice(products, 10, 30);
        System.out.println(result); // => ["milk", "fish"]
    }

    public static ArrayList<String> getProductsByPrice(List<Product> products, int minPrice, int maxPrice) {
        var filteredProducts = new ArrayList<String>();
        for (var item : products) {
            var price = item.getPrice();
            if (price >= minPrice && price <= maxPrice) {
                filteredProducts.add(item.getTitle());
            }
        }
        return filteredProducts;
    }
}

class Product {

    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a program which define class Product with data member as id, name and
 * price. Store the information of 5 products and Display the name of product
 * having minimum price (Use array of object).
 */
class Product {
    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = String.valueOf(name);
        this.price = price;
    }

    String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        for (int i = 0; i < 4; i++) {
            products[i] = new Product(i, "Pen" + i, i + 5);
        }
        products[4] = new Product(4, "Eraser", 3);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + " " + products[i].getPrice());
        }
        Arrays.sort(products, Comparator.comparing(Product::getPrice));
        System.out.println(products[0].getName());
    }
}

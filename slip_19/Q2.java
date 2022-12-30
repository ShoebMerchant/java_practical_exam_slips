import java.util.Scanner;

/**
 * Create an abstract class order having members id, description. Create a
 * subclass Purchase Order having member as customer name. Define methods
 * accept and display. Create 3 objects each of Purchase Order. Accept and
 * display the details.
 */
abstract class Order {
    int id;
    String description;
};

class PurchaseOrder extends Order {
    String customerName;

    void accept(int id, String description, String customerName) {
        Scanner in = new Scanner(System.in);
        this.id = in.nextInt();
        this.description = in.next();
        this.customerName = in.next();
    }

    void display() {
        System.out.println(id + " " + description + " " + customerName);
    }
}

public class Q2 {
    public static void main(String[] args) {
        PurchaseOrder o1 = new PurchaseOrder();
        PurchaseOrder o2 = new PurchaseOrder();
        o1.accept(1, "Pen", "shoeb");
        o1.display();

    }
}

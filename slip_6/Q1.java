import java.util.Scanner;
import java.util.TreeSet;

/**
 * Accept 'n' integers from the user and store them in a collection. Display
 * them in the sorted order. The collection should not accept duplicate
 * elements. (Use a suitable collection). Search for a particular element using
 * predefined search method in the Collection framework.
 */

public class Q1 {
    public static void main(String[] args) throws Exception {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Integers to add to collection : ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your " + (i + 1) + " Integer : ");
            ts.add(in.nextInt());
        }
        System.out.println("Sorted Collection : " + ts);
        System.out.print("Enter Element to search in the collection : ");
        int s = in.nextInt();
        if (ts.contains(s))
            System.out.println("Element found");
        else
            System.out.println("Element not found");

    }
}

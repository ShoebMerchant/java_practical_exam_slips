import java.util.*;

/**
 * Construct a Linked List having names of Fruits: Apple, Banana, Guava and
 * Orange. Display the contents of the List using an Iterator.
 */

public class Q1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Guava");
        list.add("Orange");

        ListIterator<String> itr = list.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Create a Hash table containing Employee name and Salary. Display the details
 * of the hash table.
 */

public class Q1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        ht.put("Shoeb", 50000);
        ht.put("Hair", 50800);
        System.out.println(ht);
        displayHashTable(ht);
    }

    /*
     * Overkill method to display Hashtable
     */
    public static void displayHashTable(Hashtable<String, Integer> ht) {
        Enumeration<String> k = ht.keys();
        Enumeration<Integer> v = ht.elements();
        while (k.hasMoreElements()) {
            System.out.println(k.nextElement() + "\t" + v.nextElement());
        }
    }
}

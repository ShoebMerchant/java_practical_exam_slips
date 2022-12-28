import java.util.*;

/**
 * Construct a linked List containing names of colours: red, blue, yellow and
 * orange. Then extend the program to do the following:
 * i. Display the contents of the List using an Iterator
 * ii. Display the contents of the List in reverse order using a ListIterator
 * iii. Create another list containing pink and green. Insert the elements of
 * this list between blue and yellow.
 */
class Q2 {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");
        System.out.println(colors);

        // ListIterator to iterate colors LinkedList
        ListIterator<String> colors_itr = colors.listIterator();

        while (colors_itr.hasNext()) {
            System.out.println(colors_itr.next() + " ");
        }

        // ListIterator for pointing to last index of colors LinkedList
        colors_itr = colors.listIterator(colors.size());

        while (colors_itr.hasPrevious()) {
            System.out.println(colors_itr.previous() + " ");
        }

        LinkedList<String> colors2 = new LinkedList<String>();
        colors2.add("pink");
        colors2.add("green");
        colors.addAll(2, colors2);
        System.out.println(colors);
    }
}

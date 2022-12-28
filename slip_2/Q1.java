import java.util.*;

/**
 * Write a program to accept ‘n’ integers from the user & store them in an Array
 * List collection. Display the elements of Array List.
 */
public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of integers - ");
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter your " + (i + 1) + " integer : ");
                int j = input.nextInt();
                arr_list.add(j);
            }
        }
        System.out.println(arr_list);
    }
}

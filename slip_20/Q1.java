import java.util.Arrays;

/**
 * Write a program to accept 3 numbers using command line argument. Sort and
 * display the numbers.
 */
public class Q1 {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[] { Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]) };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

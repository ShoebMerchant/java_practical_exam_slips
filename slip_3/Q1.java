import java.util.*;

/**
 * Write a program to accept the 'n' different numbers from user and store it in
 * array. Also print the sum of elements of the array.
 */
public class Q1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of Integers : ");
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the " + (i + 1) + " Integers : ");
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

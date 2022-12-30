import java.util.*;

/**
 * Write a program to accept the 'n' different numbers from user and store it in
 * array. Display maximum number from an array.
 */
public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(maxNumFromArray(arr));
    }

    public static int maxNumFromArray(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

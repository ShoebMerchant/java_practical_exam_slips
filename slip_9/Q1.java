import java.io.*;

/**
 * Write a program to accept a number from user. Check whether number is perfect
 * or not. Use BufferedReader class for accepting input from user.
 * A number which is sum of it's positive divisors
 */
public class Q1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            System.out.println("Number is perfect");
    }
}

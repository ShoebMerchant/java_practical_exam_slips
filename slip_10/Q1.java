import java.util.Scanner;

/**
 * Write a program to accept a number from user. Check whether number is prime
 * or not.
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        if (isPrime(n)) {
            System.out.println("Number is Prime");
        } else
            System.out.println("Number is not prime");
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        if (n < 2)
            return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                flag = false;
        }
        return flag;
    }
}

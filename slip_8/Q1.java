/**
 * Write a program to reverse a number. Accept number using command line
 * argument.
 */

public class Q1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int revOfNum = reverseNumber(num);
        System.out.println(revOfNum);
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        do {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        } while (num > 0);
        return rev;
    }
}

/**
 * Write a program to print the factors of a number. Accept a number using
 * command line argument.
 */
public class Q1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

import java.util.Scanner;

/**
 * Write a program to accept a number from the user, if number is zero then
 * throw user defined exception ―Number is 0, otherwise display factorial of a
 * number.
 */

class NumberIsZeroException extends Exception {
    public NumberIsZeroException() {
        super("Number is zero");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A number : ");
        int n = in.nextInt();
        try {
            if (n == 0) {
                throw new NumberIsZeroException();
            }
            int f = 1;
            // f(3) = 1*2*3
            for (int i = 2; i <= n; i++) {
                f *= i;
            }
            System.out.println("Factorial of " + n + " is : " + f);
        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}

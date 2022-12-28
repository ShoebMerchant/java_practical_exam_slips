import java.util.*;

/**
 * Write a program to accept a number from user and generate multiplication
 * table of a number.
 */
class Q1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please Enter your number - ");
            int n = input.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }
    }
}
import java.util.Scanner;

/**
 * Write a program to accept the user name and greets the user by name. Before
 * displaying the user's name, convert it to upper case letters. For example, if
 * the user's name is Raj, then display greet message as "Hello, RAJ, nice to
 * meet you!".
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you");
    }

}

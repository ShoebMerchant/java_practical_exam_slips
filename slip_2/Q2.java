/**
 * Define a class MyNumber having one private integer data member. Write a
 * default constructor initialize it to 0 and another constructor to initialize
 * it to a value. Write methods isNegative, isPositive, isOdd, iseven. Use
 * command line argument to pass a value to the object and perform the above
 * operations.
 */

class MyNumber {
    private int n;

    MyNumber() {
        this.n = 0;
    }

    MyNumber(int n) {
        this.n = n;
    }

    void isNegative() {
        if (n < 0) {
            System.out.println("Number is Negative");
        }
    }

    void isPositive() {
        if (n > 0) {
            System.out.println("Number is Positive");
        }
    }

    void isOdd() {
        if ((n & 1) == 1)
            System.out.println("Number is Odd");
    }

    void isEven() {
        if ((n & 1) == 0)
            System.out.println("Number is Even");
    }
}

public class Q2 {
    public static void main(String[] args) {
        MyNumber m = new MyNumber(Integer.parseInt(args[0]));
        m.isNegative();
        m.isPositive();
        m.isOdd();
        m.isEven();
    }
}

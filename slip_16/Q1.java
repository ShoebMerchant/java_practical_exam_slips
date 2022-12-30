/**
 * Define a class MyNumber having one private integer data member. Write a
 * parameterized constructor to initialize to a value. Write isEven() to check
 * given number is even or not. Use command line argument to pass a value to the
 * object.
 */

class MyNumber {
    private int num;

    MyNumber(int num) {
        this.num = num;
    }

    boolean isEven() {
        if ((num & 1) == 0)
            return true;
        return false;
    }
};

public class Q1 {
    public static void main(String[] args) {
        MyNumber n = new MyNumber(Integer.parseInt(args[0]));
        System.out.println(n.isEven());
    }
}

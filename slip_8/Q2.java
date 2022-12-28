import java.util.Scanner;

/**
 * Define a class MyDate (day, month, year) with methods to accept and display
 * MyDate object. Accept date as dd, mm, yyyy. Throw user defined exception
 * InvalidDateException if the date is invalid. Examples of invalid dates : 12
 * 15 2015, 31 6 1990, 29 2 2001
 */

class InvalidDateException extends Exception {
    public InvalidDateException(String s) {
        super(s);
    }
}

class MyDate {
    int day, month, year;

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date in the following format \"dd,mm,yyyy\" : ");
        try {

            String[] date = in.next().split(",");
            int d = Integer.parseInt(date[0]);
            int m = Integer.parseInt(date[1]);
            int y = Integer.parseInt(date[2]);
            if (d < 1 || d > 31) {
                throw new InvalidDateException("Invalid Day");
            } else if (m < 0 || m > 12) {
                throw new InvalidDateException("Invalid Month");
            } else if (y < 0 || y > 9999) {
                throw new InvalidDateException("Invalid Year");
            }
            day = d;
            month = m;
            year = y;
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
            accept();
        }

    }

    void display() {
        System.out.println("Day " + day + " month " + month + " year " + year);
    }
}

public class Q2 {
    public static void main(String[] args) throws Exception {
        MyDate date = new MyDate();
        date.accept();
        date.display();
    }
}

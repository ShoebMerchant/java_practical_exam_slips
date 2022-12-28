import java.util.Scanner;

/**
 * Define a class student having rollno, name and percentage. Define Default and
 * parameterized constructor. Accept the 5 student details and display it. (Use
 * this keyword).
 */

class Student {
    int rollNo, percentage;
    String name;

    Student() {
        rollNo = 0;
        percentage = 0;
        name = "Student";
    }

    Student(int rollNo, int percentage, String name) {
        this.rollNo = rollNo;
        this.percentage = percentage;
        this.name = name;
    }

    void display() {
        System.out.println("Students : " + rollNo + percentage + name);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student roll no. : ");
            int rollno = in.nextInt();
            System.out.print("Students percentage : ");
            int per = in.nextInt();
            System.out.println("Students name");
            String name = in.next();
            students[i] = new Student(rollno, per, name);
        }
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}

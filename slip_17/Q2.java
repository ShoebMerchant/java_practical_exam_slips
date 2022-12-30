/**
 * Define a class Student with attributes rollno and name. Define default and
 * parameterized constructor. Keep the count of Objects created. Create objects
 * using parameterized constructor and Display the object count after each
 * object is created.
 */
class Student {
    public static int count = 0;
    int rollNo;
    String name;

    Student() {
        count++;
        rollNo = 0;
        name = "Student";
        displayStudentsCount();
    }

    Student(int rollNo, String name) {
        count++;
        this.rollNo = rollNo;
        this.name = name;
        displayStudentsCount();
    }

    void displayStudentsCount() {
        System.out.println("Student count: " + count);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student(1, "csnkjcn");
    }
}

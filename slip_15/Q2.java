/**
 * Write a program to create a super class Employee (members – name, salary).
 * Derive a sub- class as Developer (member – projectname). Create object of
 * Developer and display the details of it.
 */

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + " salary: " + salary);
    }
};

class Developer extends Employee {
    String projectname;

    Developer(String name, int salary, String projectname) {
        super(name, salary);
        this.projectname = projectname;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Project: " + projectname);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Developer d = new Developer("shoeb", 50000000, "foodpedia");
        d.display();
    }
}

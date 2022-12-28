import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Write a program which define class Employee with data member as id, name and
 * salary Store the information of 'n' employees and Display the name of
 * employee having maximum salary (Use array of object).
 */

class Employee {
    int id, salary;
    String name;

    void setEmployeeData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter id : ");
        id = in.nextInt();
        System.out.print("Enter name : ");
        name = in.next();
        System.out.print("Enter salary : ");
        salary = in.nextInt();
    }

    void printEmployee() {
        System.out.println("Employee id, name, salary : " + id + ", " + name + ", " + salary);
    }

    int getSalary() {
        return salary;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter No. of employees : ");
        int n = in.nextInt();
        Employee employees[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            employees[i].setEmployeeData();
        }
        for (int i = 0; i < employees.length; i++) {
            employees[i].printEmployee();
        }
        empWithMaxSalary(employees);

        // This is another approach to find employee with max salary
        // Arrays.sort(employees, Comparator.comparing(Employee::getSalary));
        // employees[employees.length - 1].printEmployee();
    }

    public static void empWithMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        int emplIdxWithMaxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                emplIdxWithMaxSalary = i;
            }
        }
        employees[emplIdxWithMaxSalary].printEmployee();
    }
}

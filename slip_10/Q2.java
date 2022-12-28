import utility.CapitalString;

/**
 * Create a package "utility". Define a class CapitalString under "utility"
 * package which will contain a method to return String with first letter
 * capital. Create a Person class (members – name, city) outside the package.
 * Display the person name with first letter as capital by making use of
 * CapitalString.
 * 
 ** To compile utility file
 * javac -d . utility.java
 */

class Person {
    String name, city;

    Person() {
        name = "Shoeb";
        city = "Pune";
    }

    String getName() {
        return name;
    }
};

public class Q2 {
    public static void main(String[] args) {
        String str = "shoeb";
        CapitalString cs = new CapitalString();
        Person p = new Person();
        System.out.println(cs.startCase(p.getName()));
    }
}

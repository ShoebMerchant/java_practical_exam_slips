import java.util.Scanner;

/**
 * Create an abstract class Shape with methods area & volume. Derive a class
 * Cylinder (radius, height). Calculate area and volume.
 */

abstract class Shape {
    public static final double PI = Math.PI;

    abstract double area();

    abstract double volume();
};

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double area() {
        // 2πrh+2πr2
        return ((2 * PI * radius * height) + (2 * PI * radius * radius));
    }

    double volume() {
        // πr2h
        return PI * (radius * radius) * height;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double h = in.nextDouble();
        Shape c = new Cylinder(r, h);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}

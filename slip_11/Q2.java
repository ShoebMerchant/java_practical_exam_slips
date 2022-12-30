/**
 * Create an abstract class Shape with methods area & volume. Derive a class
 * Sphere (radius). Calculate and display area and volume.
 */

abstract class Shape {
    static final double PI = Math.PI;

    abstract double area();

    abstract double volume();
};

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double area() {
        // Area of a sphere is 4πr2
        return 4 * PI * radius * radius;
    }

    double volume() {
        // Volume of sphere 4/3πr3
        return ((4 / 3) * PI * (radius * radius * radius));
    }
};

public class Q2 {
    public static void main(String[] args) {
        Shape s = new Sphere(6);
        System.out.println(s.area());
        System.out.println(s.volume());
    }
}

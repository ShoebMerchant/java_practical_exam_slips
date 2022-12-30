/**
 * Define an interface Operation which has methods area(),volume(). Define a
 * constant PI having value 3.142. Create a class circle (member – radius) which
 * implements this interface. Calculate and display the area and volume.
 */
interface Operation {
    public static final double PI = 3.142;

    double area();

    double volume();
};

class Circle implements Operation {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double volume() {
        // 4/3 × π × radius3
        return (4 / 3) * PI * Math.pow(radius, 3);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println(circle.area());
        System.out.println(circle.volume());
    }
}

/**
 * Define a Point class having members – x,y(coordinates). Define default
 * constructor and parameterized constructors. Define subclass Point3D with
 * member as z (coordinate). Write display method to show the details of Point.
 */

class Point {
    int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("X: " + x + " Y: " + y);
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void display() {
        super.display();
        System.out.println("Z: " + z);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 5);
        p.display();
    }
}

/**
 * Define a Point class having members – x,y (coordinates). Define default
 * constructor and parameterized constructors. Define subclass ColorPoint with
 * member as color. Write display method to display the details of Point.
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
        System.out.println("X-coordinate : " + x);
        System.out.println("Y-coordinate : " + y);
    }
}

class ColorPoint extends Point {
    String color;
}

public class Q2 {
    public static void main(String[] args) {
        Point p = new Point(4, 5);
        p.display();
    }
}

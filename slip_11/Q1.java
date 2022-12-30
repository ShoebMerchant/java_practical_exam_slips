/**
 * Write a program create class as MyDate with dd,mm,yy as data members. Write
 * parameterized constructor. Display the date in dd-mm-yy format. (Use this
 * keyword)
 */
class MyDate {
    int dd, mm, yy;

    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void display() {
        System.out.println("Date is : " + dd + "," + mm + "," + yy);
    }
};

public class Q1 {
    public static void main(String[] args) {
        MyDate date = new MyDate(18, 10, 2001);
        date.display();
    }
}

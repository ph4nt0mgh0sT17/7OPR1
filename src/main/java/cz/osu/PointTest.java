package cz.osu;

public class PointTest {
    public static void main(String[] args) {
        Point a = new Point(5,5);
        Point b = new Point(2,2);
        Point c = a.sum(b);

        a.print();
        b.print();
        c.print();

        b.offset(3, 4);
        b.print();
    }
}

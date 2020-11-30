package cz.osu;

public class Point {
    private double x;
    private double y;

    //<editor-fold desc="Constructors">

    public Point() {
        setX(0);
        setY(0);
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public Point(Point point) {
        this(point.getX(), point.getY());
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters">

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //</editor-fold>

    public Point sum(Point point) {
        return new Point(getX() + point.getX(), getY() + point.getY());
    }

    public Point subtract(Point point) {
        return new Point(getX() - point.getX(), getY() - point.getY());
    }

    public void offset(double x, double y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

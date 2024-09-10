public class Parallelogram extends Trapezoid {
    private double height;

    // Constructor
    public Parallelogram(Point p1, Point p2, Point p3, Point p4, double height) {
        super(p1, p2, p3, p4, height);
    }

    @Override
    public double getArea() {
        double base = Math.abs(getPoint1().getX() - getPoint2().getX());
        return base * height;
    }

    @Override
    public String toString() {
        return String.format("%s%nArea of Parallelogram: %.2f", super.toString(), getArea());
    }
}

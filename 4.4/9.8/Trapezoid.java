public class Trapezoid extends Quadrilateral {
    private double height;

    // Constructor
    public Trapezoid(Point p1, Point p2, Point p3, Point p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    // Calculate area
    public double getArea() {
        double base1 = Math.abs(getPoint1().getX() - getPoint2().getX());
        double base2 = Math.abs(getPoint3().getX() - getPoint4().getX());
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public String toString() {
        return String.format("%s%nArea of Trapezoid: %.2f", super.toString(), getArea());
    }
}

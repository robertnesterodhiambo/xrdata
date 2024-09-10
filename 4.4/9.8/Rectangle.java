public class Rectangle extends Parallelogram {
    // Constructor
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4, Math.abs(p1.getY() - p3.getY()));
    }

    @Override
    public double getArea() {
        double length = Math.abs(getPoint1().getX() - getPoint2().getX());
        double width = Math.abs(getPoint2().getY() - getPoint3().getY());
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("%s%nArea of Rectangle: %.2f", super.toString(), getArea());
    }
}

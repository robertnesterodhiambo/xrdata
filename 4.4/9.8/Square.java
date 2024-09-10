public class Square extends Rectangle {
    // Constructor
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        double side = Math.abs(getPoint1().getX() - getPoint2().getX());
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("%s%nArea of Square: %.2f", super.toString(), getArea());
    }
}

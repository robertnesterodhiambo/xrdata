public class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    // Constructor
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
        point4 = p4;
    }

    // Getters
    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    @Override
    public String toString() {
        return String.format("Quadrilateral points: %s, %s, %s, %s", point1, point2, point3, point4);
    }
}

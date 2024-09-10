public class QuadrilateralTest {
    public static void main(String[] args) {
        // Define points for the quadrilaterals
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(1, 3);

        // Test Trapezoid
        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4, 3);
        System.out.println(trapezoid);

        // Test Parallelogram
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4, 3);
        System.out.println(parallelogram);

        // Define points for Rectangle
        Point r1 = new Point(0, 0);
        Point r2 = new Point(4, 0);
        Point r3 = new Point(4, 3);
        Point r4 = new Point(0, 3);

        // Test Rectangle
        Rectangle rectangle = new Rectangle(r1, r2, r3, r4);
        System.out.println(rectangle);

        // Define points for Square
        Point s1 = new Point(0, 0);
        Point s2 = new Point(2, 0);
        Point s3 = new Point(2, 2);
        Point s4 = new Point(0, 2);

        // Test Square
        Square square = new Square(s1, s2, s3, s4);
        System.out.println(square);
    }
}

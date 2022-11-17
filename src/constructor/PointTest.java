package src.constructor;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(1);
        point1.setY(10);
        point1.setZ(100);
        System.out.println("point1 = " + point1);

        Point point2 = new Point(20,30,50);
        System.out.println("point2 = " + point2);

        Point point3 = new Point(40);
        System.out.println("point3 = " + point3);

        Point point4 = new Point(2,5);
        System.out.println("point4 = " + point4);
    }
}

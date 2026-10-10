package pp2.week03.geometry;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Point =====");
        Point a = new Point();
        Point b = new Point(3, 4);
        Point c = new Point(b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c (copy of b) = " + c);

        a.setX(1);
        a.setY(1);
        System.out.println("a after setX(1), setY(1) = " + a);
        System.out.println("a.getX() = " + a.getX() + ", a.getY() = " + a.getY());

        a.translate(2, -1);
        System.out.println("a after translate(2, -1) = " + a);

        System.out.println("distance from (0,0) to b = " + new Point().distance(b));
        System.out.println("b.equals(c) = " + b.equals(c));
        System.out.println("a.equals(b) = " + a.equals(b));

        System.out.println();
        System.out.println("===== Segment =====");
        Segment s1 = new Segment(new Point(0, 1), new Point(4, 9));
        Segment s2 = new Segment(4, 9, 0, 1);
        Segment s3 = new Segment(0, 0, 5, 0);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("s1.getP1() = " + s1.getP1() + ", s1.getP2() = " + s1.getP2());
        System.out.println("s1.length() = " + s1.length());
        System.out.println("s3.length() = " + s3.length());
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(s3) = " + s1.equals(s3));

        System.out.println("s1.getSlope() = " + s1.getSlope());
        System.out.println("s1.getIntercept() = " + s1.getIntercept());

        Point onSegment = new Point(2, 5);
        Point onLineOnly = new Point(6, 13);
        Point offLine = new Point(2, 2);
        System.out.println("s1.isOnLine" + onSegment + " = " + s1.isOnLine(onSegment));
        System.out.println("s1.isOnSegment" + onSegment + " = " + s1.isOnSegment(onSegment));
        System.out.println("s1.isOnLine" + onLineOnly + " = " + s1.isOnLine(onLineOnly));
        System.out.println("s1.isOnSegment" + onLineOnly + " = " + s1.isOnSegment(onLineOnly));
        System.out.println("s1.isOnLine" + offLine + " = " + s1.isOnLine(offLine));
        System.out.println("s1.isOnSegment" + offLine + " = " + s1.isOnSegment(offLine));

        s3.setP1(new Point(1, 1));
        s3.setP2(new Point(1, 6));
        System.out.println("s3 after setP1(1,1), setP2(1,6) = " + s3);
        s3.translate(2, 3);
        System.out.println("s3 after translate(2, 3) = " + s3);
        System.out.println("s3.isOnSegment(3, 7) = " + s3.isOnSegment(new Point(3, 7)));
    }
}

import static java.lang.Math.PI;

public class Area {
    public static double areaCircle(double radius) {
        if (radius < 0 ) {

            return -1.0;
        }
        double circle = radius*radius*PI;

        return circle;
    }

    public static double areaRect(double x, double y) {
        if (x < 0||y<0) {

            return -1.0;
        }
double rect = x*y;

        return  rect;
    }
}

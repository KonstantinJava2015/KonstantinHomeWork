package mathClasses;

/**
 * Created by User on 22.12.2015.
 */
public class Squares {
    public static double squareOfRectangle(double side1, double side2){
        return side1 * side2;
    }

    public static double squareOfCircle(double radius){
        return Math.PI * radius * radius;
    }

    public static double squareOfTriangle(double side1, double side2, double side3){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}

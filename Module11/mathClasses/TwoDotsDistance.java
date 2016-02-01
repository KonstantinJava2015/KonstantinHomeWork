package mathClasses;

/**
 * Created by User on 22.12.2015.
 */
public class TwoDotsDistance {
    public static double calculateDistance(double x1, double x2, double y1, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}

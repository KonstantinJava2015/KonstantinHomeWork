package finalproject;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import static java.lang.Math.sin;


/**
 * Created by miroslavlyamkin on 29.01.16. Тело программы
 */
public class Dichotomia {

    public static final double POGRESHNOST = 1e-10;
    private double segmentBeginning;
    private double segmentEnding;


    public void setSegmentBeginning(double segmentBeginning) {
        this.segmentBeginning = segmentBeginning;
    }

    public void setSegmentEnding(double segmentEnding) {
        this.segmentEnding = segmentEnding;
    }



    public double minValueFunction(double segmentBeginning, double segmentEnding) {

        while (abs(segmentEnding - segmentBeginning) > POGRESHNOST) {
            double halfSum = getHalfSum(segmentBeginning, segmentEnding);
            if (func(segmentBeginning) < func(segmentEnding)) {
                segmentEnding = halfSum;
            } else {
                segmentBeginning = halfSum;
            }
        }
        return func((segmentBeginning + segmentEnding)/2);
    }

    public double getHalfSum(double segmentBeginning, double segmentEnding) {
        return (segmentBeginning + segmentEnding)/2;
    }

   public double maxValueFunction(double segmentBeginning, double segmentEnding) {
        while (abs(segmentEnding - segmentBeginning) > POGRESHNOST) {
            double halfSum = getHalfSum(segmentBeginning, segmentEnding);
            if (func(segmentBeginning) > func(segmentEnding)) {
                segmentEnding = halfSum;
            } else {
                segmentBeginning = halfSum;
            }
        }
        return func((segmentBeginning + segmentEnding)/2);
    }

    double func (double x) {
        // функция F(x)=4sin(3x-1)-(x в степени корень квадратный из 2)+1
        double result = 4 * sin(3 * x - 1) - pow(x, pow(2, 0.5)) + 1;
        return result;
    }


    //Adding a method which will return String instead of printing it on console
    public String getAnswer(){
        return "Minimal value: " + minValueFunction(segmentBeginning,segmentEnding) +
                "\n" + "Maximum value: " + maxValueFunction(segmentBeginning,segmentEnding);
    }
}

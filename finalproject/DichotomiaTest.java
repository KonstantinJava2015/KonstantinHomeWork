package finalproject;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static org.junit.Assert.*;

/**
 * Created by User on 02.02.2016.
 */
public class DichotomiaTest {

    @Test
    public void testFunc() throws Exception {
        double x = 10;
        double expectedResult = 4 * sin(3 * x - 1) - pow(x, pow(2, 0.5)) + 1;

        double receivedResult = new Dichotomia().func(x);

        Assert.assertEquals(expectedResult, receivedResult, 0.01);

    }

    @Test
    public void testMinValueFunction() throws Exception {
        double begin = 10;
        double end = 20;
        double expectedMin = -66.026;

        Dichotomia dichotomia = new Dichotomia();

        dichotomia.setSegmentBeginning(begin);
        dichotomia.setSegmentEnding(end);

        double receivedMin = dichotomia.minValueFunction(begin, end);

        Assert.assertEquals(expectedMin, receivedMin, 0.01);

    }

    @Test
    public void testMaxValueFunction() throws Exception {
        double begin = 30;
        double end = 40;
        double expectedMax = -118.291;

        Dichotomia dichotomia = new Dichotomia();

        dichotomia.setSegmentBeginning(begin);
        dichotomia.setSegmentEnding(end);

        double receivedMax = dichotomia.maxValueFunction(begin, end);

        Assert.assertEquals(expectedMax, receivedMax, 0.01);

    }
}
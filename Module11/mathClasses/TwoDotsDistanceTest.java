package mathClasses;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by User on 01.02.2016.
 */
public class TwoDotsDistanceTest {

    @org.junit.Test
    public void testCalculateDistance() throws Exception {
        double x1 = 5;
        double x2 = 5;
        double y1 = 5;
        double y2 = 10;

        double result = TwoDotsDistance.calculateDistance(x1, x2, y1, y2);

        Assert.assertEquals(5.0, result, 0);
    }
}
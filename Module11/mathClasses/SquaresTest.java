package mathClasses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 01.02.2016.
 */
public class SquaresTest {

    @Test
    public void testSquareOfRectangle() throws Exception {
        final double side1 = 10;
        final double side2 = 20;
        final double expectedResult = 200;
        double receivedResult = Squares.squareOfRectangle(side1, side2);

        Assert.assertEquals(expectedResult, receivedResult, 0.01);

    }

    @Test
    public void testSquareOfCircle() throws Exception {
        final double radius = 10;
        final double expectedResult = Math.PI * Math.pow(radius, 2);
        final double receivedResult = Squares.squareOfCircle(radius);

        Assert.assertEquals(expectedResult, receivedResult, 0.01);

    }

    @Test
    public void testSquareOfTriangle() throws Exception {
        double side1 = 10;
        double side2 = 10;
        double side3 = 10;
        double expectedResult = 43.3;
        double receivedResult = Squares.squareOfTriangle(side1, side2, side3);

        System.out.println(expectedResult);

        Assert.assertEquals(expectedResult, receivedResult, 0.01);
    }
}
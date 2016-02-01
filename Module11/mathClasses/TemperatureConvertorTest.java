package mathClasses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 01.02.2016.
 */
public class TemperatureConvertorTest {

    @Test
    public void testCelsiusToFahrenheit() throws Exception {
        double givenCelsius = 28;
        double expectedFahrenheit = 82.4;

        double result = TemperatureConvertor.celsiusToFahrenheit(givenCelsius);

        Assert.assertEquals(expectedFahrenheit, result, 0);
    }

    @Test
    public void testFahrenheitToCelsius() throws Exception {
        double givenFahrenheit = 82.4;
        double expectedCelsius = 28;

        double result = TemperatureConvertor.fahrenheitToCelsius(givenFahrenheit);
        Assert.assertEquals(expectedCelsius, result, 0.1);
    }
}
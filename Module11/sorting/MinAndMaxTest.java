package sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 01.02.2016.
 */
public class MinAndMaxTest {

    private int[] ints = {1, 2, 3, 4, -100, 3, 4,  1000};

    @Test
    public void testMinValue() throws Exception {
        Assert.assertEquals(MinAndMax.MinValue(ints), -100);

    }

    @Test
    public void testMaxValue() throws Exception {
        Assert.assertEquals(MinAndMax.MaxValue(ints), 1000);
    }
}
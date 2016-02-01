package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by User on 01.02.2016.
 */
public class SortingTest {

    @Test
    public void testChoiceSorting() throws Exception {
        Double[] doubles = {8.8, 2.1, 1.1, 44.0, 100.8};
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(doubles));

        ArrayList<Double> expectedResult = list;
        Collections.sort(expectedResult);

        Assert.assertEquals(expectedResult, Sorting.ChoiceSorting(list));
    }
}
package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void testTreeSet(){
        Integer[] ints = {27, 55, 0, 100, 97};
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(ints));

        Assert.assertFalse(ts.isEmpty());

        Assert.assertFalse(ts.add(27));

        Integer expectedSize = 5;
        Integer actualSize = ts.size();
        Assert.assertEquals(expectedSize, actualSize);

        Integer expectedPollFirst = 0;
        Integer actualPollFirst = ts.pollFirst();
        Integer expectedPollLast = 100;
        Integer actualPollLast = ts.pollLast();
        Assert.assertEquals(expectedPollFirst, actualPollFirst);
        Assert.assertEquals(expectedPollLast, actualPollLast);

        Integer expectedFirst = 27;
        Integer actualFirst = ts.first();
        Integer expectedLast = 97;
        Integer actualLast = ts.last();
        Assert.assertEquals(expectedFirst, actualFirst);
        Assert.assertEquals(expectedLast, actualLast);

    }
}

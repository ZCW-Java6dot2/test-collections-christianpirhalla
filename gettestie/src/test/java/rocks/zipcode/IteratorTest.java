package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void iteratorTest1(){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));

        Iterator<Integer> ite = nums.iterator();

        Assert.assertTrue(ite.hasNext());

        Integer expected = 1;
        Integer actual = ite.next();
        Assert.assertEquals(expected, actual);

        Integer expected2 = 2;
        Integer actual2 = ite.next();
        Assert.assertEquals(expected2, actual2);

        ite.remove(); // should remove 3

        ArrayList<String> expectedEntries = new ArrayList<>(Arrays.asList(new String[]{"4", "5"}));
        ArrayList<String> actualEntries = new ArrayList<>();
        ite.forEachRemaining(i -> actualEntries.add(Integer.toString(i)));

        Assert.assertEquals(expectedEntries, actualEntries);




    }

}

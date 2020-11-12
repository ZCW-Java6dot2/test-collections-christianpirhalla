package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Vector;

public class VectorTest {

    @Test
    public void vectorTest1(){
        Vector<Integer> vec = new Vector<>();
        // initial capacity should be 10
        Integer expectedCapacity = 10;
        Integer actualCapacity = vec.capacity();
        Assert.assertEquals(expectedCapacity, actualCapacity);

        //should also be empty
        Assert.assertTrue(vec.isEmpty());

        Integer[] intArray = {12, 13, 14, 15, 16};
        vec.addAll(Arrays.asList(intArray));

        //12 should be in there now that I've added it
        Integer expectedInt = 12;
        Assert.assertTrue(vec.contains(expectedInt));

        //and it should be at the first index since it was the first element I added
        Integer actualInt = vec.get(0);
        Assert.assertEquals(expectedInt, actualInt);

        //let's remove something now
        Integer expectedInt2 = 16;
        Integer actualInt2 = vec.remove(4);
        Assert.assertEquals(expectedInt2, actualInt2);

        //Now that we have 4 elements, let's trim it to size
        vec.trimToSize();
        Integer expectedSize = 4;
        Integer actualSize = vec.size();
        Assert.assertEquals(expectedSize, actualSize);

        //And let's see if it resizes properly
        vec.add(500);
        Integer expectedSize2 = 5;
        Integer actualSize2 = vec.size();
        Assert.assertEquals(expectedSize2, actualSize2);

    }

}

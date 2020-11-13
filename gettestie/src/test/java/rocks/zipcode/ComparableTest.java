package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;


public class ComparableTest{

    @Test
    public void comparableTest1() {
        Integer int1 = 27;
        Integer int2 = 45;
        Integer int3 = 27;

        Integer expectedResult1 = 0;
        Integer expectedResult2 = 1;
        Integer expectedResult3 = -1;


        Integer actualResult1 = int1.compareTo(int3);
        Integer actualResult2 = int2.compareTo(int1);
        Integer actualResult3 = int1.compareTo(int2);

        Assert.assertEquals(expectedResult1, actualResult1);
        Assert.assertEquals(expectedResult2, actualResult2);
        Assert.assertEquals(expectedResult3, actualResult3);

    }

}

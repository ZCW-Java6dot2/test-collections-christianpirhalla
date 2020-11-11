package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestList {

    @Test
    public void listTestPositive(){
        ArrayList<Person> raymond = new ArrayList<>();
        //should be empty
        Assert.assertTrue(raymond.isEmpty());

        //add some people
        Person p1 = new Person("Jesse", 1990);
        Person p2 = new Person("Antonino", 1970);
        Person p3 = new Person("Alyx", 1975);
        Assert.assertTrue(raymond.add(p1));
        Assert.assertTrue(raymond.add(p2));
        Assert.assertTrue(raymond.add(p3));

        //See if p2 is in there (it should be)
        Assert.assertTrue(raymond.contains(p2));

        //remove it
        Assert.assertTrue(raymond.remove(p2));

        //Check the size, should be 2 now that we removed something
        int expectedSize = 2;
        int actualSize = raymond.size();
        Assert.assertEquals(expectedSize, actualSize);

        //get by index, p3 should have shifted
        Person expectedPerson = p3;
        Person actualPerson = raymond.get(1);
        Assert.assertEquals(expectedPerson, actualPerson);

        //clear
        raymond.clear();
        Assert.assertTrue(raymond.isEmpty());

    }

    @Test
    public void testListNegative(){
        ArrayList<Person> raymond = new ArrayList<>(0);
        Person p1 = new Person("Jake", 2002);

        //see if he's in there
        Assert.assertFalse(raymond.contains(p1));

        //Try to remove him
        Assert.assertFalse(raymond.remove(p1));

    }


}

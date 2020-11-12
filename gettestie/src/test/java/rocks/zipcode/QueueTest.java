package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class QueueTest {

    @Test
    public void queueTest1(){

        LinkedList<Person> link = new LinkedList<>();
        Person p1 = new Person("Henry", 1950);
        Person p2 = new Person("Dorothy", 1935);
        Person p3 = new Person("Kait", 1995);

        //add
        Assert.assertTrue(link.add(p1));
        Assert.assertTrue(link.add(p2));
        Assert.assertTrue(link.add(p3));

        //size
        Integer expectedSize = 3;
        Integer actualSize = link.size();
        Assert.assertEquals(expectedSize, actualSize);

        //peek, should show me the first person I added
        Person expectedPerson1 = p1;
        Person actualPerson1 = link.peek();
        Assert.assertEquals(expectedPerson1, actualPerson1);

        //remove, should get rid of the first person I added
        Person actualPerson2 = link.remove();
        Assert.assertEquals(expectedPerson1, actualPerson2);


    }

}

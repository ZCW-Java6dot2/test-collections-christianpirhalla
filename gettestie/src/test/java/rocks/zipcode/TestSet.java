package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestSet {

    @Test
    public void hashSetTest(){
        HashSet<Person> hashy = new HashSet<>();
        //check if it's empty
        Assert.assertTrue(hashy.isEmpty());

        //add three elements
        Person p1 = new Person("Jarvins", 1996);
        Person p2 = new Person("James", 1965);
        Person p3 = new Person("Jamiroquai", 1990);
        hashy.add(p1);
        hashy.add(p2);
        hashy.add(p3);
        int expectedSize = 3; // we added 3 ppl
        int actualSize = hashy.size();
        //get the size of the hashset
        Assert.assertEquals(expectedSize, actualSize);


        //see if an object is contained
        Assert.assertTrue(hashy.contains(p1));

        //try to add an object that is already in there
        Assert.assertFalse(hashy.add(p1));

        //remove that object
        Assert.assertTrue(hashy.remove(p1));
        //see if it's still in there
        Assert.assertFalse(hashy.contains(p1));
        //try to remove it again
        Assert.assertFalse(hashy.remove(p1));

        //clear the hash set
        hashy.clear();
        //check if it's empty
        Assert.assertTrue(hashy.isEmpty());
    }

}

package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class MapTest {

    @Test
    public void mapTest1(){
        HashMap<Person, Integer> hashy = new HashMap<Person, Integer>();

        //Should be empty
        Assert.assertTrue(hashy.isEmpty());

        //put some things in it
        Person person1 = new Person("Frank", 1990);
        Person person2 = new Person("Fillip", 1980);
        Person person3 = new Person("Garriden", 2017);
        Integer expectedVal = 1;
        Integer expectedVal2 = 67;
        hashy.put(person1, expectedVal);
        hashy.put(person2, expectedVal2);
        hashy.put(person3, 247);

        //See if what we wanted to be in there is in there
        Assert.assertTrue(hashy.containsKey(person1));
        Assert.assertTrue(hashy.containsValue(expectedVal2));

        Integer actualVal = hashy.get(person1);
        Assert.assertEquals(hashy.get(person1), expectedVal);

        //Remove something
        hashy.remove(person3);

        //Check on the size
        Integer expectedSize = 2;
        Integer actualSize = hashy.size();
        Assert.assertEquals(expectedSize, actualSize);


    }

    @Test
    public void mapTest2(){
        HashMap<Person, Integer> hashy = new HashMap<>();
        Person person1 = new Person("Zeke", 1945);


        //I never put person1 in, so all of these should return false
        Assert.assertFalse(hashy.containsKey(person1));
        Assert.assertFalse(hashy.containsValue(999));
        Assert.assertFalse(hashy.remove(person1, 999));


    }


}

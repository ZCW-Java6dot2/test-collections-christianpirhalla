package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class DequeTest {

    @Test
    public void dequeTest1(){
        ArrayDeque<Person> dee = new ArrayDeque<>();
        Person person1 = new Person("Edsger", 1930);
        Person person2 = new Person("Antony", 1970);
        Person person3 = new Person("Isabella", 1940);

        //Add
        dee.add(person2);
        dee.addFirst(person3);
        dee.addLast(person1);

        //isEmpty
        Assert.assertFalse(dee.isEmpty());

        //peekFirst/Last
        Person expectedFirst = person3;
        Person expectedLast = person1;
        Person actualFirst = dee.peekFirst();
        Person actualLast = dee.peekLast();
        Assert.assertEquals(expectedFirst, actualFirst);
        Assert.assertEquals(expectedLast, actualLast);

        //removeFirst/Last
        Person actualLastRemoved = dee.removeLast();
        Person actualFirstRemoved = dee.removeFirst();
        Assert.assertEquals(expectedFirst, actualFirstRemoved);
        Assert.assertEquals(expectedLast, actualLastRemoved);


    }
}

package rocks.zipcode;

import org.junit.Assert;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public void priorityQueueTest1(){
        PriorityQueue<String> pq = new PriorityQueue<>();

        Assert.assertTrue(pq.isEmpty());
        pq.add("Zeta");
        pq.add("Alpha");
        pq.add("Beta");
        pq.add("Kappa");

        String expected = "Alpha";
        String actual = pq.poll();
        Assert.assertEquals(expected,actual);

        String expected2 = "Beta";
        String actual2 = pq.peek();
        Assert.assertEquals(expected2, actual2);

        Integer expectedSize = 4;
        Integer actualSize = pq.size();
        Assert.assertEquals(expectedSize, actualSize);

        pq.clear();
        Assert.assertTrue(pq.isEmpty());

    }
}

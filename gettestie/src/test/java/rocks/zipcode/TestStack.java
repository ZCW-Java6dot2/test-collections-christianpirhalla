package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        String expected = "Vamo lá";
        stack.push(expected);
        //We should have something on the stack now, check it out
        assertFalse(stack.isEmpty());
        //Look and see if peek gets us what we put on there
        assertEquals(expected, stack.peek());
        //Look and see if pop gets us what we put on there
        assertEquals(expected, stack.pop());
        //Look and see if pop actually removed it
        assertTrue(stack.isEmpty());

    }
}

package neetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {
    @Test
    public void test() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(0);
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(2, stack.top());
        assertEquals(1, stack.getMin());
    }
}
package neetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackReTest {
    @Test
    void test() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        assertEquals(0, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.top());
        assertEquals(1, minStack.getMin());
    }
}
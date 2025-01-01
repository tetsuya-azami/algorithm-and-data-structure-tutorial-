package neetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackReReTest {
    @Test
    void test() {
        MinStackReRe minStackReRe = new MinStackReRe();
        minStackReRe.push(1);
        minStackReRe.push(2);
        minStackReRe.push(0);
        assertEquals(0, minStackReRe.getMin());
        minStackReRe.pop();
        assertEquals(2, minStackReRe.top());
        assertEquals(1, minStackReRe.getMin());
    }

    @Test
    void test2() {
        MinStackReRe minStackReRe = new MinStackReRe();
        minStackReRe.push(-2);
        minStackReRe.push(-2);
        minStackReRe.push(-3);
        minStackReRe.push(-3);
        assertEquals(-3, minStackReRe.getMin());
        minStackReRe.pop();
        assertEquals(-3, minStackReRe.getMin());
    }
}
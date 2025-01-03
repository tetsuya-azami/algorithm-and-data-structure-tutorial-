package neetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackReReReTest {
    @Test
    void test() {
        MinStackReReRe minStackReReRe = new MinStackReReRe();
        minStackReReRe.push(1);
        minStackReReRe.push(2);
        minStackReReRe.push(0);
        assertEquals(0, minStackReReRe.getMin());
        minStackReReRe.pop();
        assertEquals(2, minStackReReRe.top());
        assertEquals(1, minStackReReRe.getMin());
    }

    @Test
    void test2() {
        MinStackReReRe minStackReReRe = new MinStackReReRe();
        minStackReReRe.push(-2);
        minStackReReRe.push(-2);
        minStackReReRe.push(-3);
        minStackReReRe.push(-3);
        assertEquals(-3, minStackReReRe.getMin());
        minStackReReRe.pop();
        assertEquals(-3, minStackReReRe.getMin());
    }
}
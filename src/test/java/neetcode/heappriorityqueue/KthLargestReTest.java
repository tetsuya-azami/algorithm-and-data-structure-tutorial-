package neetcode.heappriorityqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestReTest {
    @Test
    public void test() {
        KthLargestRe kthLargestRe = new KthLargestRe(1, new int[]{});
        assertEquals(3, kthLargestRe.add(3));
        assertEquals(3, kthLargestRe.add(-2));
        assertEquals(5, kthLargestRe.add(5));
        assertEquals(10, kthLargestRe.add(10));
        assertEquals(10, kthLargestRe.add(9));
    }
}

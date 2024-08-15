package neetcode.heappriorityqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestTest {
    @Test
    public void test() {
        KthLargest kthLargest = new KthLargest(3, new int[]{1, 2, 3, 3});
        int result1 = kthLargest.add(3);
        assertEquals(3, result1);
        int result2 = kthLargest.add(5);
        assertEquals(3, result2);
        int result3 = kthLargest.add(6);
        assertEquals(3, result3);
        int result4 = kthLargest.add(7);
        assertEquals(5, result4);
        int result5 = kthLargest.add(8);
        assertEquals(6, result5);
    }
}
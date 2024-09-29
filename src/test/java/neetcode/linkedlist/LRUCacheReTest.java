package neetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheReTest {
    @Test
    public void test() {
        LRUCacheRe cache = new LRUCacheRe(2);
        cache.put(1, 10);
        assertEquals(10, cache.get(1));
        cache.put(2, 20);
        cache.put(3, 30);
        assertEquals(20, cache.get(2));
        assertEquals(-1, cache.get(1));
    }
}
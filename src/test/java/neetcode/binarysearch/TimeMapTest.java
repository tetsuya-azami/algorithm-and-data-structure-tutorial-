package neetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeMapTest {

    @Test
    public void test() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("alice", "happy", 1);
        String s1 = timeMap.get("alice", 1);
        assertEquals("happy", s1);
        String s2 = timeMap.get("alice", 2);
        assertEquals("happy", s2);
        timeMap.set("alice", "sad", 3);
        String s3 = timeMap.get("alice", 3);
        assertEquals("sad", s3);
    }
}
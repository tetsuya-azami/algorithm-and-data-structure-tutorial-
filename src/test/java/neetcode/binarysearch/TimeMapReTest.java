package neetcode.binarysearch;

import org.junit.jupiter.api.Test;

class TimeMapReTest {
    @Test
    void test() {
        TimeMapRe timeMap = new TimeMapRe();
        timeMap.set("alice", "happy", 1);  // store the key "alice" and value "happy" along with timestamp = 1.
        timeMap.get("alice", 1);           // return "happy"
        timeMap.get("alice", 2);           // return "happy", there is no value stored for timestamp 2, thus we return the value at timestamp 1.
        timeMap.set("alice", "sad", 3);    // store the key "alice" and value "sad" along with timestamp = 3.
        timeMap.get("alice", 3);           // return "sad"
    }
}
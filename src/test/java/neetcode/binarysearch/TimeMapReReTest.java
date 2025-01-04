package neetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeMapReReTest {
    @Test
    void test() {
        TimeMapReRe timeMapReRe = new TimeMapReRe();
        timeMapReRe.set("alice", "happy", 1);  // store the key "alice" and value "happy" along with timestamp = 1.
        timeMapReRe.get("alice", 1);           // return "happy"
        timeMapReRe.get("alice", 2);           // return "happy", there is no value stored for timestamp 2, thus we return the value at timestamp 1.
        timeMapReRe.set("alice", "sad", 3);    // store the key "alice" and value "sad" along with timestamp = 3.
        timeMapReRe.get("alice", 3);           // return "sad"
    }

    @Test
    void test2() {
        TimeMapReRe timeMapReRe = new TimeMapReRe();
        String actual = timeMapReRe.get("alice", 3);
        assertEquals("", actual);
    }
}
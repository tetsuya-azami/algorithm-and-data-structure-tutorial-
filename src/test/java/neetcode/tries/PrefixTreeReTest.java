package neetcode.tries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrefixTreeReTest {
    @Test
    void test() {
        PrefixTreeRe prefixTreeRe = new PrefixTreeRe();
        prefixTreeRe.insert("dog");
        assertTrue(prefixTreeRe.search("dog"));
        assertFalse(prefixTreeRe.search("do"));
        assertTrue(prefixTreeRe.startsWith("do"));
        prefixTreeRe.insert("do");
        assertTrue(prefixTreeRe.search("do"));
    }
}
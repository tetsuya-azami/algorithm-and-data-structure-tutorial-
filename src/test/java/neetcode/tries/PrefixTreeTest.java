package neetcode.tries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrefixTreeTest {
    @Test
    void test() {
        PrefixTree prefixTree = new PrefixTree();
        prefixTree.insert("dog");
        prefixTree.search("dog");
        assertFalse(prefixTree.search("do"));
        assertTrue(prefixTree.startsWith("do"));
        prefixTree.insert("do");
        assertTrue(prefixTree.search("do"));
    }
}
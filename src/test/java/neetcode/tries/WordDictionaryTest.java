package neetcode.tries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordDictionaryTest {
    @Test
    void test() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("day");
        wordDictionary.addWord("bay");
        wordDictionary.addWord("may");
        assertFalse(wordDictionary.search("say"));
        assertTrue(wordDictionary.search("day"));
        assertTrue(wordDictionary.search(".ay"));
        assertTrue(wordDictionary.search("b.."));
    }
}
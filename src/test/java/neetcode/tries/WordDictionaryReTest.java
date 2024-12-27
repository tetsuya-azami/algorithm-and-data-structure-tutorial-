package neetcode.tries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordDictionaryReTest {
    @Test
    void test() {
        WordDictionaryRe wordDictionaryRe = new WordDictionaryRe();
        wordDictionaryRe.addWord("day");
        wordDictionaryRe.addWord("bay");
        wordDictionaryRe.addWord("may");
        assertFalse(wordDictionaryRe.search("say"));
        assertTrue(wordDictionaryRe.search("day"));
        assertTrue(wordDictionaryRe.search(".ay"));
        assertTrue(wordDictionaryRe.search("b.."));
    }

    @Test
    void test2() {
        WordDictionaryRe wordDictionaryRe = new WordDictionaryRe();
        wordDictionaryRe.addWord("a");
        wordDictionaryRe.addWord("abcdefghijklmnopqrst");
        assertTrue(wordDictionaryRe.search("a"));
        assertTrue(wordDictionaryRe.search("abcdefghijklmnopqrst"));
    }

    @Test
    void test3() {
        WordDictionaryRe wordDictionaryRe = new WordDictionaryRe();
        wordDictionaryRe.addWord("international");
        wordDictionaryRe.addWord("interstellar");
        wordDictionaryRe.addWord("interstate");
        assertTrue(wordDictionaryRe.search("inter.......l"));
    }

    @Test
    void test4() {
        WordDictionaryRe wordDictionaryRe = new WordDictionaryRe();
        wordDictionaryRe.addWord("dog");
        assertFalse(wordDictionaryRe.search("do.."));
    }

    @Test
    void test5() {
        WordDictionaryRe wordDictionaryRe = new WordDictionaryRe();
        wordDictionaryRe.addWord("application");
        wordDictionaryRe.addWord("appreciation");
        assertFalse(wordDictionaryRe.search("app..........n"));
        assertFalse(wordDictionaryRe.search("a...........n"));
        assertTrue(wordDictionaryRe.search("app........n"));
        assertTrue(wordDictionaryRe.search("a.........n"));
    }
}
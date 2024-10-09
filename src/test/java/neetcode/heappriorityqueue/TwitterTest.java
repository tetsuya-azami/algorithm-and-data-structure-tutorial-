package neetcode.heappriorityqueue;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwitterTest {
    @Test
    void test() {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 10); // User 1 posts a new tweet with id = 10.
        twitter.postTweet(2, 20); // User 2 posts a new tweet with id = 20.
        assertEquals(List.of(10), twitter.getNewsFeed(1));
        assertEquals(List.of(20), twitter.getNewsFeed(2));
        twitter.follow(1, 2); // フォローするとその人のニュースフィードが見れるようになる
        assertEquals(List.of(20, 10), twitter.getNewsFeed(1));
        assertEquals(List.of(20), twitter.getNewsFeed(2));
        twitter.unfollow(1, 2); // フォローを外すとその人のニュースフィードが見れなくなる
        assertEquals(List.of(10), twitter.getNewsFeed(1));
    }
}
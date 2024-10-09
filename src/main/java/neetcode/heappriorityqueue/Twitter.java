package neetcode.heappriorityqueue;

import java.util.*;

class Twitter {

    private int count;
    private final HashMap<Integer, List<int[]>> newsFeedMap; // List<[count, tweetId]>
    private final HashMap<Integer, Set<Integer>> followsMap;

    public Twitter() {
        count = 0;
        newsFeedMap = new HashMap<>();
        followsMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        newsFeedMap.computeIfAbsent(userId, key -> new ArrayList<>()).add(new int[]{count--, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); // count, tweetId, followeeId, lastIndex

        followsMap.computeIfAbsent(userId, key -> new HashSet<>()).add(userId);
        for (Integer followId : followsMap.get(userId)) {
            if (newsFeedMap.containsKey(followId)) {
                List<int[]> tweets = newsFeedMap.get(followId);
                int lastIndex = tweets.size() - 1;
                int[] latestTweet = tweets.get(lastIndex);
                queue.offer(new int[]{latestTweet[0], latestTweet[1], followId, lastIndex});
            }
        }

        while (!queue.isEmpty() && result.size() < 10) {
            int[] tweet = queue.poll();
            result.add(tweet[1]);
            int followId = tweet[2];
            int lastTweetIndex = tweet[3];
            if (lastTweetIndex > 0) {
                int[] secondLastTweet = newsFeedMap.get(followId).get(lastTweetIndex - 1);
                queue.offer(new int[]{secondLastTweet[0], secondLastTweet[1], followId, lastTweetIndex - 1});
            }
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {
        followsMap.computeIfAbsent(followerId, key -> new HashSet<>()).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        followsMap.computeIfPresent(followerId, (key, followees) -> {
            followees.remove(followeeId);
            return followees.isEmpty() ? null : followees;
        });
    }
}
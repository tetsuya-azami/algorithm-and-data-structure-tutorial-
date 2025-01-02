package neetcode.binarysearch;

public class SolutionReRe {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int l = 1;
        int r = max;
        int k = max;
        while (l <= r) {
            int time = 0;
            int mid = (l + r) / 2;
            for (int pile : piles) {
                time += (int) Math.ceil((double) pile / mid);
            }
            if (time <= h) {
                k = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return k;
    }
}

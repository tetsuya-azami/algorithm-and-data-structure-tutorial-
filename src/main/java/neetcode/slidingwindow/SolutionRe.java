package neetcode.slidingwindow;

public class SolutionRe {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minimum) minimum = prices[i];
            maxProfit = Math.max(maxProfit, prices[i] - minimum);
        }

        return maxProfit;
    }

    public int maxProfitTwoPointers(int[] prices) {
        int left = 0;
        int right = 0;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[right] < prices[left]) left = right;
            maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            right++;
        }

        return maxProfit;
    }

    public int maxProfitRe(int[] prices) {
        int minPricePointer = 0;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            // 最低価格を更新
            if (prices[i] < prices[minPricePointer]) {
                minPricePointer = i;
            }
            // 最高利益を更新
            result = Math.max(result, prices[i] - prices[minPricePointer]);
        }

        return result;
    }
}

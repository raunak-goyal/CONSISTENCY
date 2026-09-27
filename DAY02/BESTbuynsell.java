class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Best profit if we sell today
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);

            // Keep track of the cheapest buying price
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}
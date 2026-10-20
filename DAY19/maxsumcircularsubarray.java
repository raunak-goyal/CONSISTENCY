class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int maxEnding = 0;
        int maxSum = nums[0];

        int minEnding = 0;
        int minSum = nums[0];

        for (int num : nums) {
            maxEnding = Math.max(num, maxEnding + num);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(num, minEnding + num);
            minSum = Math.min(minSum, minEnding);

            total += num;
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }
}
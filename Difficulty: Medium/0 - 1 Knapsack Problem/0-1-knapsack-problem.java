
        class Solution {
    public int knapsack(int capacity, int val[], int wt[]) {
        int n = val.length;
        int[] dp = new int[capacity + 1];

        // Process each item
        for (int i = 0; i < n; i++) {
            // Iterate backwards to prevent using the same item multiple times
            for (int w = capacity; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }

        return dp[capacity];
    }
}
    
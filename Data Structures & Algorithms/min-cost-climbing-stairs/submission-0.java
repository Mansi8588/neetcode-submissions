class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int one = 0; // dp[i-2]
        int two = 0; // dp[i-1]

        for (int i = 2; i <= n; i++) {
            int current = Math.min(
                two + cost[i - 1],
                one + cost[i - 2]
            );

            one = two;
            two = current;
        }

        return two;
    }
}
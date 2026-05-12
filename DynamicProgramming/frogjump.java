package DynamicProgramming;

import java.util.Arrays;


public class frogjump {

    // Top-Down DP (Memoization)
    static int solveTopDown(int[] height, int n, int[] dp) {
        // Base case: already at the first stone, no cost
        if (n == 0) return 0;

        // Return cached result if already computed
        if (dp[n] != -1) return dp[n];

        // Cost of jumping from stone n-1 to stone n
        int jumpOne = solveTopDown(height, n - 1, dp)
                      + Math.abs(height[n] - height[n - 1]);

        // Cost of jumping from stone n-2 to stone n (if valid)
        int jumpTwo = Integer.MAX_VALUE;
        if (n >= 2) {
            jumpTwo = solveTopDown(height, n - 2, dp)
                      + Math.abs(height[n] - height[n - 2]);
        }

        // Cache and return the minimum cost
        dp[n] = Math.min(jumpOne, jumpTwo);
        return dp[n];
    }

    // Bottom-Up DP (Tabulation)
    static int solveTabulation(int[] height) {
        int n = height.length;
        int[] dp = new int[n];

        // Base case: cost to stay at stone 0 is 0
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            // Cost if we come from stone i-1 (1-step jump)
            int jumpOne = dp[i - 1] + Math.abs(height[i] - height[i - 1]);

            // Cost if we come from stone i-2 (2-step jump), only if valid
            int jumpTwo = Integer.MAX_VALUE;
            if (i >= 2) {
                jumpTwo = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
            }

            // Store the minimum cost to reach stone i
            dp[i] = Math.min(jumpOne, jumpTwo);
        }

        // Answer is the min cost to reach the last stone
        return dp[n - 1];
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] height1 = {10, 20, 30, 10};
        int n1 = height1.length;
        int[] dp1 = new int[n1];
        Arrays.fill(dp1, -1);
        System.out.println("Heights: " + Arrays.toString(height1));
        System.out.println("Min Cost (Memoization) : " + solveTopDown(height1, n1 - 1, dp1));
        System.out.println("Min Cost (Tabulation)  : " + solveTabulation(height1));

        System.out.println();

        // Test Case 2
        int[] height2 = {40, 10, 20, 70, 80, 10};
        int n2 = height2.length;
        int[] dp2 = new int[n2];
        Arrays.fill(dp2, -1);
        System.out.println("Heights: " + Arrays.toString(height2));
        System.out.println("Min Cost (Memoization) : " + solveTopDown(height2, n2 - 1, dp2));
        System.out.println("Min Cost (Tabulation)  : " + solveTabulation(height2));
    }
}

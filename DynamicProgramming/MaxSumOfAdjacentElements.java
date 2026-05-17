package DynamicProgramming;

import java.util.Arrays;

public class MaxSumOfAdjacentElements {
    public int recursion(int[] arr , int index ){
        if(index >= arr.length) return 0;
        
        int take = arr[index] + recursion(arr, index + 2);

        int notTake = recursion(arr, index + 1);

        return Math.max(take , notTake);
        
    }
    public int memoization(int[] dp , int index , int[] arr  ){
        if(index >= arr.length) return 0;
        if(dp[index] != -1) return dp[index];

        int take = arr[index] + memoization(dp, index + 2 ,  arr);
        int notTake = memoization(dp, index + 1 , arr);

        dp[index] = Math.max(take , notTake);
        return dp[index];
    }

    public int tabulation(int[] arr){
        if(arr.length == 0) return 0;

        int[] dp = new int[arr.length];

        dp[0] = arr[0];

        for(int index = 1;index < arr.length; index ++){
            int take = arr[index];
            if(index > 1) take += dp[index - 2];

            int notTake = dp[index -1];

            dp[index] = Math.max(take,notTake);
        }
        return dp[arr.length - 1];
        
    }

    public int spaceOptimization(int[] arr){
        if(arr.length == 0) return 0;

        int prev2 = 0;
        int prev = arr[0];

        for(int index =1;index < arr.length;index++){
            int take = arr[index];
            if(index > 1) take += prev2;

            int notTake = prev;

            int curr = Math.max(take , notTake);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};

        // dp[i] stores the answer for index i in memoization.
        int[] dp = new int[arr.length];

        // -1 means this state has not been computed yet.
        Arrays.fill(dp, -1);

        MaxSumOfAdjacentElements obj = new MaxSumOfAdjacentElements();

        // Plain recursion result.
        System.out.println(obj.recursion(arr, 0));

        // Memoization result.
        System.out.println(obj.memoization(dp, 0, arr));

        // Tabulation result.
        System.out.println(obj.tabulation(arr));

        // Space optimization result.
        System.out.println(obj.spaceOptimization(arr));
    }
    
}

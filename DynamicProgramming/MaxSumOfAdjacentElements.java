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

    public void tabulation(int[] arr){
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};

        // dp[i] stores the answer for index i.
        int[] dp = new int[arr.length];

        // -1 means this state has not been computed yet.
        Arrays.fill(dp, -1);

        MaxSumOfAdjacentElements obj = new MaxSumOfAdjacentElements();

        // Start from index 0 and print the maximum sum of non-adjacent elements.
        System.out.println(obj.memoization(dp, 0, arr));

        
    }
    
}

package DynamicProgramming;
import java.util.Arrays;


public class houseRobber {
    public int recursion(int[] nums , int index){
        if(index >= nums.length) return 0; //base condition

        int rob = nums[index] + recursion(nums, index + 2);
        int skip = recursion(nums, index + 1);

        return Math.max(rob , skip);
    }
    public int memoization(int[] nums , int index , int[] dp){
        if(index >= nums.length) return 0;
        if(dp[index] != -1) return dp[index];

        int rob = nums[index] + memoization(nums, index + 2, dp);
        int skip = memoization(nums, index + 1, dp);

        dp[index] = Math.max(rob,skip);
        return dp[index];
    }
    public int tabulation(int[] nums){
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for(int index = 1;index < nums.length;index++){
            int take = nums[index];
            if(index > 1) take+=dp[index - 2];

            int notTake = dp[index - 1];
            dp[index] = Math.max(take,notTake);
        }
        return dp[nums.length - 1];
    }
    public int spaceOptimization(int[] arr){
        if(arr.length == 0) return 0;

        int prev2 = 0;
        int prev = arr[0];

        for (int index = 1;index < arr.length;index++){
            int rob = arr[index];
            if(index > 1) rob += prev2;

            int skip = prev;

            int curr = Math.max(rob,skip);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        houseRobber obj = new houseRobber();
        System.out.println(obj.recursion(nums, 0));
        System.out.println(obj.memoization(nums, 0,dp));
        System.out.println(obj.tabulation(nums));
        System.out.println(obj.spaceOptimization(nums));
    }
    
}

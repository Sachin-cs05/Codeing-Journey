import java.util.Arrays;

public class min_cost_climbing_stairs {
    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(min_cost(arr, 0));
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(min_costTD(arr, 0, dp));
        System.out.println(min_costBU(arr));
        System.out.println(min_cost(arr,0));

    }

    // using only recursion

    public static int min_cost(int[] nums, int i){
        if(i>= nums.length) return 0;

        int first = min_cost(nums, i+1);
        int sec = min_cost(nums, i+2);
        return Math.min(first, sec)+nums[i];
    }

    // using Top Down
    public static int min_costTD(int[] nums, int i, int[] dp){
        if(i >= nums.length) return 0;

        if(dp[i] != -1) return dp[i];

        int first = min_costTD(nums, i+1,dp);
        int sec = min_costTD(nums, i+2,dp);
        return dp[i]=Math.min(first, sec)+nums[i];
    }

    // using Buttom up

    public static int min_costBU(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < dp.length; i++) {
            int first = dp[i-1];
            int sec = dp[i-2];
            dp[i] = Math.min(first, sec)+nums[i];
        }
        return Math.min(dp[dp.length-1], dp[dp.length-2]);
    }
}

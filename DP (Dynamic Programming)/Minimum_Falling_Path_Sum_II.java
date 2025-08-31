import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] dp = new int[nums.length][nums[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, -100000);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.min(ans, minpathsum(nums, 0, i,dp));
        }
        System.out.println(ans);
    }
    public static int minpathsum(int[][] nums, int i, int j, int[][] dp){

        if(i == nums.length-1) return nums[i][j];

        if (dp[i][j] != -100000) return dp[i][j];
        
        int ans = Integer.MAX_VALUE;
        for (int k = 0; k < dp[0].length; k++) {
            if(j!=k){
                ans = Math.min(ans,minpathsum(nums, i+1, k, dp));
            }
        }
        return dp[i][j]=ans+nums[i][j];
    }
}

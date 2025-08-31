import java.util.Arrays;

public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
        int[][] nums = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        int[][] dp = new int[nums.length][nums[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, -100000);
        }
        int ans1 = Integer.MAX_VALUE; // for recursion
        int ans2 = Integer.MAX_VALUE; // for top down dp

        // for recursion
        for (int i = 0; i < nums.length; i++) {
            ans1 = Math.min(ans1, minpathsum(nums, 0, i));
        }

        // for top down dp
        for (int i = 0; i < nums.length; i++) {
            ans2 = Math.min(ans2, minpathsum_TD(nums, 0, i,dp));
        }
        System.out.println(ans1); // for recursion
        System.out.println(ans2); // for top down dp
    }

    //  use recursion

    public static int minpathsum(int[][] nums, int i, int j){
        if(j >= nums[0].length || j<0) return Integer.MAX_VALUE;
        if(i == nums.length-1) return nums[i][j];

        int ld = minpathsum(nums, i+1, j-1);
        int rd = minpathsum(nums, i+1, j+1);
        int down = minpathsum(nums, i+1, j);
        return Math.min(rd, Math.min(ld, down))+nums[i][j];
    }

    //  use top down dp

    public static int minpathsum_TD(int[][]nums, int i, int j, int[][] dp){
        if(j >= nums[0].length || j<0) return Integer.MAX_VALUE;
        if(i == nums.length-1) return nums[i][j];

        if(dp[i][j] != -100000) return dp[i][j];
        int ld = minpathsum_TD(nums, i+1, j-1,dp);
        int rd = minpathsum_TD(nums, i+1, j+1,dp);
        int down = minpathsum_TD(nums, i+1, j,dp);
        return dp[i][j]=Math.min(rd, Math.min(ld, down))+nums[i][j];
    }
}

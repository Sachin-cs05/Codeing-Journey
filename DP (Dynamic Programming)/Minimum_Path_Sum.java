import java.util.Arrays;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
        int[][] nums = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        int[][] dp = new int[nums.length][nums[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
        System.out.println(minPathsum(nums, 0, 0));
        System.out.println(minPath_TD(nums, 0, 0,dp));
    }

    // use recursion 

    public static int minPathsum(int[][] nums,int cr, int cc){
        if(cr == nums.length-1 && cc == nums[0].length-1) return nums[cr][cc];
        if(cr>=nums.length || cc>= nums[0].length) return Integer.MAX_VALUE;

        int down = minPathsum(nums, cr+1, cc);
        int right = minPathsum(nums, cr, cc+1);
        return Math.min(down, right)+nums[cr][cc];
    }

    //  use Bottom up Top Down

    public static int minPath_TD(int[][]nums, int i, int j, int[][] dp){
        if (i == nums.length - 1 && j == nums[0].length - 1) {
			return nums[i][j];
		}
		if (i >= nums.length || j >= nums[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int down = minPath_TD(nums, i + 1, j, dp);
		int right = minPath_TD(nums, i, j + 1, dp);
		return dp[i][j] = nums[i][j] + Math.min(down, right);
    } 
}
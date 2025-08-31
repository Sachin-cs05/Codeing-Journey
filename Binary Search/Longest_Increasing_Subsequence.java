public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println(LIS(arr));
    }
    public static int LIS(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int len =1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>dp[len-1]) {
                dp[len]=nums[i];
                len++;
            }
            else {
				int idx = BinarySearch(dp, 0, len - 1, nums[i]);
				dp[idx] = nums[i];
			}
        }
        return len;
    }
    public static int BinarySearch(int[] dp,int si, int ei, int item){
        int ans = 0;
        while (si<=ei) {
            int mid = si+(ei-si)/2;
            if(dp[mid] >= item) {
                ans = mid;
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return ans;
    }
}

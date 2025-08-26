import java.util.Arrays;

public class house_robber {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        // int[] dp = new int[arr.length];
        // Arrays.fill(dp, -1);
        // System.out.println(robberTD(arr, 0, dp));
        // System.out.println(robberTDBack(arr, arr.length-1, dp));
        System.out.println(robberBU(arr));
    }

    // public static int robberTD(int[] nums, int i, int[] dp){
    //     if(i>=nums.length){
    //         return 0;
    //     }    
    //     if(dp[i] != -1){
    //         return dp[i];
    //     }                                       
    //     int rob = nums[i]+robberTD(nums,i+2,dp);
    //     int Dn_rob = robberTD(nums,i+1,dp);
    //     return dp[i] = Math.max(rob,Dn_rob);
    // }

    // public static int robberTDBack(int[] nums, int i, int[] dp){
    //     if(i<0){
    //         return 0;
    //     }    
    //     if(dp[i] != -1){
    //         return dp[i];
    //     }                                       
    //     int rob = nums[i]+robberTDBack(nums,i-2,dp);
    //     int Dn_rob = robberTDBack(nums,i-1,dp);
    //     return dp[i] = Math.max(rob,Dn_rob);
    // }

    public static int robberBU(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < dp.length; i++) {
            int rob = nums[i]+dp[i-2];
            int dn_rob = dp[i-1];
            dp[i] = Math.max(rob, dn_rob);
        }
        return dp[dp.length-1];
    }


    // public static int robber(int[] nums, int i){
    //     if(i>=nums.length){
    //         return 0;
    //     }                                                givr TLE
    //     int rob = nums[i]+robber(nums,i+2);
    //     int Dn_rob = robber(nums,i+1);
    //     return Math.max(rob,Dn_rob);
    // }
}
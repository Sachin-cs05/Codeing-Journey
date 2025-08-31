public class single_number{
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3};
        System.out.println(singleNo(nums));
    }
    public static int singleNo(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans^=nums[i];
        }
        return ans;
    }
}
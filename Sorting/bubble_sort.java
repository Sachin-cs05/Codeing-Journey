public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,6,1,8,7};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void sort(int[] nums){
        for (int turn = 1; turn < nums.length; turn++) {
            for(int i = 0;i<nums.length-turn;i++){
                if(nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
    }
}

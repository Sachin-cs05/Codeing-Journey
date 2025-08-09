public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,8,7};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void sort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int picked = nums[i];
            int j =i-1;
            while (j >= 0 && nums[j] > picked) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = picked;
        }
    }
}

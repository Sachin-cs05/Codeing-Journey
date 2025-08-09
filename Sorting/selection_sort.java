public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,8,7};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int mini = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[mini]){
                    mini = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;
        }
    }
}

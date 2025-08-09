public class print {
    public static void printarray(int[] arr){
        int n = arr.length;
        int[] nums = new int[n];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(arr[i]%2 == 0){
                nums[j++] = arr[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(arr[i]%2 != 0){
                nums[j++] = arr[i];
            }
        }
        for(int i =0;i<n;i++){
            System.out.print(nums[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,5,8,7,4,6,9,3,2,1,5};
        // 8,4,6,2,1,5,7,9,
        printarray(arr);
    }
}

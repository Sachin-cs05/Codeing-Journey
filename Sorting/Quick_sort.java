public class Quick_sort {
    public static void main(String[] args) {
        int[] nums = {5,3,4,2,1};
        sort(nums, 0, nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void sort(int[] nums, int si, int ei){
        if (si>=ei) {
            return;
        }
        int idx = partition(nums, si, ei);
        sort(nums, si, idx-1);
        sort(nums, idx+1, ei);
    }
    public static int partition(int[] arr,int si, int ei){
        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i]<=item) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}

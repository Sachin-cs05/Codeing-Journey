public class merge_sort {
    public static void main(String[] args) {
        int[] nums = {5,1,3,4,2};
        nums=sort(nums, 0, nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] sort(int[] nums, int si, int ei){
        if (si==ei) {
            int[] bs = new int[1];
            bs[0] = nums[si];
            return bs;
        }
        int mid = (ei+si)/2;
        int[] arr1 = sort(nums, si, mid);
        int[] arr2 = sort(nums, mid+1, ei);
        return Merge_TwoSorted_Array(arr1, arr2);

    }
    public static int[] Merge_TwoSorted_Array(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0;// arr1
		int j = 0;// arr2
		int k = 0;// ans
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}

import java.util.*;
public class MaxSum_of_size_k{
    public static int MaxSum(int[] nums, int k){
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int ans = sum;
        for (int i = k; i < nums.length; i++) {
            sum+=nums[i];
            sum-=nums[i-k];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(MaxSum(array, k));
    }
}
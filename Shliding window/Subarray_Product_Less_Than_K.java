import java.util.Scanner;

public class Subarray_Product_Less_Than_K {
    public static int count_of_subarray(int[] nums, int k){
        int si = 0;
        int ei = 0;
        int p = 1;
        int ans = 0;
        while(ei<nums.length){
            p*=nums[ei];
            while (p>=k && si<=ei) {
                p/=nums[si];
                si++;
            }
            ans += ei-si+1;
            ei++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(count_of_subarray(num, k));
    }
}

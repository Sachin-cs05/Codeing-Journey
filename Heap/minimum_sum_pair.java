import java.util.*;
public class minimum_sum_pair {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,4};
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            sum+= a+b;
            pq.add(a+b);
        }
        System.out.print(sum);
    }   
}

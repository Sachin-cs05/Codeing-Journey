import java.util.Stack;
public class stock_span {
    public static void main(String[] args) {
        int[] arr = {30,35,40,38,35};
        calspan(arr);
    }
    public static void calspan(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>= nums[st.peek()]){
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] = i-st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

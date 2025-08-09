import java.util.Stack;
public class leetcode_84 {
    public static void main(String[] args) {
            int[] arr = {2,1,5,6,2,3};
            System.out.println(Area(arr));
    }
    public static int Area(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            while (!st.isEmpty() && nums[i]<nums[st.peek()]) {
                int h = nums[st.pop()]; // h = height
                int r = i;  // current ele
                if (st.isEmpty()) {
                    int area = h*r;
                    ans = Math.max(ans,area);
                }
                else{
                    int l = st.peek();
                    int area = h*(r-l-1);
                    ans = Math.max(ans, area);
                }
            }
            st.push(i);
        }
        int r = nums.length;
        while (!st.isEmpty()){
                int h = nums[st.pop()]; // h = height
            if (st.isEmpty()) {
                int area = h*r;
                ans = Math.max(ans,area);
            }
            else{
                int l = st.peek();
                int area = h*(r-l-1);
                ans = Math.max(ans, area);
            }
        }
        return ans;
    }
}

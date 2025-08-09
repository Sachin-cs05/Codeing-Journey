import java.util.Stack;
public class next_greater_ele {
    public static void main(String[] args) {
        int[] arr = {11,9,13,21,3};
        NGE(arr);
    }
    public static void NGE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ans.length; i++) {
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
            ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
}

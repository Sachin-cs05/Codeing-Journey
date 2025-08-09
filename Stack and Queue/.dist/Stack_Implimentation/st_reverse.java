import java.util.Stack;
public class st_reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if (st.isEmpty()) {
            return;
        }
        int ii = st.pop();
        reverse(st);
        insert_bottom(st, ii);
    }
    public static void insert_bottom(Stack<Integer> st, int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int ii = st.pop();
        insert_bottom(st, item);
        st.push(ii);
    } 
}
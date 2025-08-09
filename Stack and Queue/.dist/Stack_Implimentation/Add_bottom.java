import java.util.Stack;
public class Add_bottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        insert_bottom(st, -9);
        System.out.println(st); 
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

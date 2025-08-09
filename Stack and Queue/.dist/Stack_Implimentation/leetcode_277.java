import java.util.Stack;
public class leetcode_277 {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        System.out.println(celebrity(mat));
    }
    public static int celebrity(int[][] mat){
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<mat.length;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            if(mat[a][b] == 1){
                st.push(b);
            }
            else{
                st.push(a);
            }
        }
        int cand = st.pop();
        for(int i = 0;i<mat.length;i++){
            if(i == cand) continue;
            if(mat[cand][i] != 0 || mat[i][cand] == 0) return -1;
        }
        return cand;
    }
}

// for leetcode

// import java.util.Scanner;
// import java.util.Stack;
// public class leetcode_277 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(celebrity(n));
//     }
//     public static int celebrity(int n){
//         Stack<Integer> st = new Stack<>();
//         for(int i = 0;i<n;i++){
//             st.push(i);
//         }
//         while (st.size()>1) {
//             int a = st.pop();
//             int b = st.pop();
//             if(knows(a,b) == true){
//                 st.push(b);
//             }
//             else{
//                 st.push(a);
//             }
//         }
//         int cand = st.pop();
//         for(int i = 0;i<n;i++){
//             if(i != cand && (knows(i,cand) == false || knows(cand,i) == true)){
//                 return -1;
//             }
//         }
//         return cand;
//     }
// }

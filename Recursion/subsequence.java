        // count and print subsequence

public class subsequence {
    public static void main(String[] args) {
        String ques = "abc";
        System.out.print("\n"+print_subsequence(ques,""));
        // System.out.println(count);
    }
    // static int count = 0;
    public static int print_subsequence(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            // count++;
            return 1;
        }
        char ch = ques.charAt(0);
        int a1 = print_subsequence(ques.substring(1), ans);
        int a2 = print_subsequence(ques.substring(1), ans+ch);
        return a1+a2;
    }
}

// import java.util.ArrayList;

// public class subsequence {
//     public static void subsequence(String str){
//         ArrayList<String> result = new ArrayList<>();
//         result.add("");
//         for(int i = 0;i<str.length();i++){
//             int n = result.size();
//             for(int j = 0;j<n;j++){
//                 result.add(result.get(j)+str.charAt(i));
//             }
//         }
//         for (int i = 0; i < result.size(); i++) {
//             System.out.println(result.get(i));
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequence(str);
//     }
    
// }
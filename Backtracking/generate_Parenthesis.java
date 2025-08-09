import java.util.*;
public class generate_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> str = new ArrayList<>();
        generateParenthesis(n,0,0,"",str);
        System.out.println(str);

    }
    public static void generateParenthesis(int n, int open, int close, String ans, List<String> str){
        if(open == n & close == n){
            str.add(ans);
            return;
        }
        if(close<open){
            generateParenthesis(n,open,close+1,ans+")",str);
        }
        if(open<n){
            generateParenthesis(n,open+1,close,ans+"(",str);
        }
    }
}

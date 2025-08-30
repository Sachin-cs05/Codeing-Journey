import java.util.Arrays;

public class Distinct_Subsequences {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(DistinctSubsequences(s, t, 0, 0));
        System.out.println(DistinctSubsequencesBU(s, t));
    }

    // use recursion
    public static int DistinctSubsequences(String s, String t , int i, int j){
        if(j == t.length()) return 1;
        if(s.length() == i) return 0;

        int inc = 0;
        int exc = 0;
        if(s.charAt(i) == t.charAt(j)){
            inc = DistinctSubsequences(s, t, i+1, j+1);
        }
        exc = DistinctSubsequences(s, t, i+1, j);
        return inc+exc;     
    }

    // use Bottom Up

    public static int DistinctSubsequencesBU(String s, String t){
        int [][] dp = new int[s.length()+1][t.length()+1];
        for(int i = 0;i<dp.length;i++){
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                } 
                else
                    {
                dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}

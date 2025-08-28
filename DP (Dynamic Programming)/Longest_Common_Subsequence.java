import java.util.*;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int[][] dp = new int[s1.length()][s2.length()];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(LCS_TD(s1, s2, 0, 0, dp));
        System.out.println(LCS_BU(s1, s2));
        System.out.println(LCS(s1, s2, 0, 0));

    }

    // using recursion
    public static int LCS(String s1, String s2, int i, int j){

        if(i == s1.length() || j==s2.length()) return 0;
        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 1+LCS(s1, s2, i+1, j+1);
        }
        else{
            int a = LCS(s1, s2, i+1, j);
            int b = LCS(s1, s2, i, j+1);
            ans = Math.max(a, b);
        }
        return ans;
    }

    //  using top down dp
    public static int LCS_TD(String s1, String s2, int i, int j, int[][] dp){

        if(i == s1.length() || j==s2.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 1+LCS_TD(s1, s2, i+1, j+1,dp);
        }
        else{
            int a = LCS_TD(s1, s2, i+1, j,dp);
            int b = LCS_TD(s1, s2, i, j+1,dp);
            ans = Math.max(a, b);
        }
        return dp[i][j] = ans;
    }
    
    // using bottom up dp
    public static int LCS_BU(String s1, String s2){

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans = 0;
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    ans = 1 + dp[i-1][j-1];
                }
                else{
                    int a = dp[i-1][j];
                    int b = dp[i][j-1];
                    ans = Math.max(a, b);
                }
                dp[i][j] = ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}

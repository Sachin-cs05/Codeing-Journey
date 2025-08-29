/*
You are given two strings, A and B. Answer, what is the smallest number of operations you need to
transform A to B?

Operations are:

Delete one letter from one of strings
Insert one letter into one of strings
Replace one of letters from one of strings with another letter
Input
T - number of test cases

For each test case:

String A
String B
Both strings will contain only uppercase characters and they won't be longer than 2000 characters. 

There will be 10 test cases in data set.

Output
For each test case, one line, minimum number of operations.

Input:
1
FOOD
MONEY

Output:
4
*/

import java.util.Arrays;

public class edit_distance {
    public static void main(String[] args) {
        String s = "FOOD";
        String T = "MONEY";
        int[][] dp = new int[s.length()][T.length()];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(editDistance(s, T, 0, 0));
        System.out.println(editDistance_TD(s, T, 0, 0, dp));
        System.out.println(editDistance_BU(s, T));
    }

    // use recursion
    public static int editDistance(String s, String t, int i, int j){

        if(i == s.length()) return t.length()-j;
        if(j == s.length()) return s.length()-i;

        int ans = 0;
        if(s.charAt(i) == t.charAt(j)){
            ans = editDistance(s, t, i+1, j+1);
        }
        else{
            int D = editDistance(s, t, i+1, j);
            int I = editDistance(s, t, i, j+1);
            int R = editDistance(s, t, i+1, j+1);
            ans = Math.min(I, Math.min(D, R))+1;
        }
        return ans;
    }

    //  use top down dp

    public static int editDistance_TD(String s, String t, int i, int j, int[][] dp){

        if(i == s.length()) return t.length()-j;
        if(j == s.length()) return s.length()-i;

        if(dp[i][j] != -1) return dp[i][j];

        int ans = 0;

        if(s.charAt(i) == t.charAt(j)){
            ans = editDistance_TD(s, t, i+1, j+1,dp); // dp[i+1][j+1]
        }
        else{
            int D = editDistance_TD(s, t, i+1, j,dp); // dp[i+1][j]
            int I = editDistance_TD(s, t, i, j+1,dp); // dp[i][j+1]
            int R = editDistance_TD(s, t, i+1, j+1,dp); // dp[i+1][j+1]
            ans = Math.min(I, Math.min(D, R))+1;
        }
        return dp[i][j] = ans;
    }

    // using Bottom up DP

    public static int editDistance_BU(String s, String t){
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = i; 
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = i; 
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans = 0;
                if(s.charAt(i-1) == t.charAt(j-1)){
                    ans = dp[i-1][j-1];
                }
                else{
                    int D =  dp[i-1][j];
                    int I =  dp[i][j-1];
                    int R =  dp[i-1][j-1];
                    ans = Math.min(I, Math.min(D, R))+1;
                }
                dp[i][j] = ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}

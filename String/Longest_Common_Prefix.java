import java.util.*;
public class Longest_Common_Prefix {
    public static int common_prefix(String s1, String s2){
        int i = 0;
        int minlength = Math.min(s1.length(),s2.length());
        while (i<minlength && s1.charAt(i) == s2.charAt(i)){
            i++;
        }
        return i;
    } 
    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int len = common_prefix(res, strs[i]);
            res = res.substring(0, len);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split("\\ ");
        System.out.println(longestCommonPrefix(s));
    }
}

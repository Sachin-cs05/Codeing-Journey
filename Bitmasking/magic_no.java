/*
 A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5.
First few magic numbers are: 5, 25, 30 (5 + 25), 125, 130 (125 + 5), …

Problem Statement:
Write a function to find the n-th Magic number.

Example:

Input: n = 2
Output: 25

Input: n = 5
Output: 130
 */

public class magic_no {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(magicNth_No(n));
    }
    public static int magicNth_No(int n){
        int ans = 0;
        int mul = 5;
        while (n>0) {
            if((n&1) !=0){
                ans = ans+mul;
            }
            mul = mul*5;
            n>>=1;
        }
        return ans;
    }
}

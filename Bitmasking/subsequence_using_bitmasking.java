public class subsequence_using_bitmasking {
    public static void main(String[] args) {
        String s = "abc";
        printSubsequence(s);
    }
    public static void printSubsequence(String s){
        int n = s.length();
        for (int i = 0; i < (1<<n); i++) {
            pattern(s,i);
        }
    }
    public static void pattern(String s, int i){
        int pos = 0;
        while (i>0) {
            if((i&1) != 0){
                System.out.print(s.charAt(pos));
            }
            i>>=1;
            pos++;
        }
        System.out.println();
    }
}

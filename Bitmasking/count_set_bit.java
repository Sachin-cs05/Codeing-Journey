public class count_set_bit {
    public static void main(String[] args) {
        int n = 76;
        System.out.println(count(n));
        System.out.println(fastcount(n));
    }
    public static int count(int n){
        int ans = 0;
        while (n!=0) {
            if((n&1) != 0) ans++;
            n>>=1;
        }
        return ans;
    }
    public static int fastcount(int n){
        int ans =0 ;
        while (n>0) {
            n = n&(n-1);
            ans++;
        }
        return ans;
    }
}

public class check_prime{
    public static void main(String[] args) {
        System.out.println(isprime(39));
    }
    public static boolean isprime(int n){
        int div = 2;
        while (div*div <= n) {
            if(n % div == 0) return false;
            div++;
        }
        return true;
    }
}
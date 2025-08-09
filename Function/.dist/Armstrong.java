import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Armstrong(n));
    }
    public static boolean Armstrong(int n){
        int c = countdigit(n);
        int sum = 0;
        int temp = n;
        while (n>0) {
            int d = n%10;
            sum = (int) (sum + Math.pow(d, c));
            n/=10;
        }
        if (sum == temp) {
            return true;
        }
        else{
            return false;
        }
    }
    public static int countdigit(int n){
        int count = 0;
        while (n>0) {
            count++;
            n/=10;
        }
        return count;
    }
}
import java.util.Scanner;
public class print_prime_number {
    public static boolean prime(int k) {
        int flag = 0;
        if (k == 0 || k == 1) {
            return false;
        } else {
            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    flag += 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (prime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}
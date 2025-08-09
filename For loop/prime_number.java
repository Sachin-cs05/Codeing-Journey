import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i<=n-1; i++){
            if(n%i==0){
                count++;
            }
        }
        if (count>=1){
            System.out.println("NOt Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}

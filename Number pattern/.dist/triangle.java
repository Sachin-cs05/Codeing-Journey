import java.util.Scanner;

public class triangle {

    public static void pattern(int num){
        int star = 1;
        int i = 1;
        int val = 1;
        while (i<=num) {
            int j = 1;
            while (j<=star) {
                System.out.print(j);
                j++;
            }
        }
        System.out.println();
        i++;
        star++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}

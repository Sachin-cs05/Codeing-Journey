import java.util.Scanner;

public class Hollow_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        int row = 1;
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j<=star) {
                System.out.print("*");
                j++;
            }
            row++;
            space--;
            System.out.println();
        }
    }
}

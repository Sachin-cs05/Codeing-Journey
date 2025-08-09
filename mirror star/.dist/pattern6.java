import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int space = 0;
        int row = 1;
        while (row<=2*n-1) {
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j<=star) {
                System.out.print(" *");
                j++;
            }
            if(row<n){
                space+=2;
            }
            else{
                space-=2;
            }
            if(row<n){
                star--;
            }
            else{
                star++;
            }
            row++;
            System.out.println();
        }
    }
}

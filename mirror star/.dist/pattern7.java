import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int space = n-1;
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
                space--;
            }
            else{
                space++;
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

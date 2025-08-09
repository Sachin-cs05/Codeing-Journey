import java.util.Scanner;

public class piremid_with_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                if(j%2!=0){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
                j++;
            }
            row++;
            star+=2;
            space--;
            System.out.println();
        }
    }
}

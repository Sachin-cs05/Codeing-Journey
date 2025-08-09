import java.util.Scanner;

public class hollow_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                if(i==1 || i==n || row == 1 || row == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                i++;
            }
            row++;
            System.out.println();
        }
    }

}

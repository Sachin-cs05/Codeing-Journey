import java.util.Arrays;
import java.util.Scanner;
public class delete_duolicate {

    public static void delete(int[] arr, int[] arr2){ 
        int j = 0;
        for (int i = 0; i < j; i++) {
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[arr.length];
        delete(arr, arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}

import java.util.*;
public class inverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr, n, 0);
    }
    public static void print(int[] arr, int n , int i){
        if(i==n){
            return;
        }
        if(arr[i] == 0){
            System.out.print(arr[i]+" ");
        }
        print(arr, n, i+1);
    }
}

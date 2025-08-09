import java.util.*;
public class second_largest{
    public static void secondlargest(int[] arr){
        int n = arr.length;
        for (int i = n-2; i > 0; i--) {
            if(arr[i]!=arr[n-1]){
                System.out.println(arr[i]);
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        secondlargest(arr);
    }
}

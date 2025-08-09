import java.util.Arrays;
import java.util.Scanner;

public class marge_two_sorted_array {

    public static void mergearray(int[] arr1, int[] arr2, int[] arr3){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0 , j=0 ,k = 0;
        while (i<n1) {
            arr3[k++] = arr1[i++];
        }
        while (j<n2) {
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of arr1 : ");
        int s1 = sc.nextInt();
        int[] arr1 = new int[s1];
        System.out.println("first array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("enter size of arr2 : ");
        int s2 = sc.nextInt();
        int[] arr2 = new int[s2];
        System.out.println("second array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[arr1.length+arr2.length];
        mergearray(arr1, arr2, arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}

import java.util.Scanner;

public class item_index_searche {

    public static int firstIndex(int[] arr, int i,int item){

        if(i == arr.length){
            return -1;
        }
        if(arr[i] == item){
            return i;
        }
        return firstIndex(arr, i+1, item);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,2,3,4,6,5,7};
        int item = sc.nextInt();
        System.out.println(firstIndex(arr, 0, item));
    }
}

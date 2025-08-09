public class reverse {

    public static void reverse_arr(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {12,23,34,45,56,10};
        reverse_arr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


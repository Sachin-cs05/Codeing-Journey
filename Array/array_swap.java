public class array_swap {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,45,56,13};
        System.out.println(arr[0]+" "+arr[4]);
        swap(arr,0,4);
        System.out.println(arr[0]+" "+ arr[4]);

    }
}
// public static void main(String[] args) {
//     int [] arr = {23,12,13,2,3};
//     System.out.println(arr[0] + " " + arr[1]);
//     swap(arr,0,1);
//     System.out.println(arr[0] + " " + arr[1]);
// }
// public static void swap(int []arr, int i, int j){
//     int temp = arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
// }

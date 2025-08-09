public class max_ele {
    public static void main(String[] args) {
        int[] arr = {3,2,41,100,1,5,6};
        int n = arr.length;
        int i = 0;
        int max = Integer.MIN_VALUE;
        System.out.println(max_element(arr, i, max, n));

    }
    public static int max_element(int[] arr, int i, int max, int n){
        if(i==n){
            return max;
        }
        if(arr[i]>max){
            max = arr[i];
        }
        return max_element(arr, i+1, max,n);
    }
}

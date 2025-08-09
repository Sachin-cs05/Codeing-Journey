public class max_ele {
    public static int Max(int[] arr){
        // int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            // max = Math.max(arr[i],max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,65,21};
        System.out.println(Max(arr));
    }
}

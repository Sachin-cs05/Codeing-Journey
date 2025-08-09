public class mean_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        double n = arr.length;
        System.out.println(mean(arr, n, 0, 0));
    }
    public static double mean(int[] arr, double n, double sum, int i){
        if(i==n){
            return (sum/n);
        }
        sum+=arr[i];
        return mean(arr,n,sum,i+1);
    }
}

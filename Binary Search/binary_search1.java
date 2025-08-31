public class binary_search1 {

    public static int search(int[] num, int item){
        int low = 0;
        int high = num.length;
        while (low<=high) {
            int mid = (low+high)/2;
            if (num[mid] == item) {
                return mid;
            }
            else if (num[mid]<item) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,11,13,15,18};
        int item = 11;
        System.out.println(search(array, item));
    }
}

public class Search {
    public static int Search(int[] arr, int item){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,23,5};
        int item = 5;
        System.out.println(Search(arr, item));
    }
}

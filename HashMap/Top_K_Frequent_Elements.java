import java.util.*;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the size of array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        System.out.print("enter the Kth frequency : ");
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : map.keySet()) {
            if(map.get(i)>=k){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}

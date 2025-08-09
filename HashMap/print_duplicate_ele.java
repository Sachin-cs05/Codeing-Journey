import java.util.*;

public class print_duplicate_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
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
        // ArrayList<Integer> duplicate = new ArrayList<>();
        // for (int key : map.keySet()) {
        //     if(map.get(key)>1){
        //         duplicate.add(key);
        //     }
        // }
        // System.out.println(duplicate);
        System.out.println(map);
    }
}

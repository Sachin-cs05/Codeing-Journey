import java.util.*;

public class Create_HashMap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            map.put(key,value);
        }
        System.out.println(map);
        // map.put(1, "read");
        // map.put(2, "white");
        // map.put(3, "black");
        // map.put(4, "red");
        // map.put(5, "yellow");
        // System.out.println(map);
        // System.out.println("map size = "+map.size());
        // // map.clear();
        // // System.out.println(map);
        
    }
}
import java.util.*;

public class Frequency_of_Characters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char i : str.toCharArray()) {
            if(i != ' '){
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }
                else{
                    map.put(i, 1);
                }
            }
        }
        System.out.println(map);
    }
}
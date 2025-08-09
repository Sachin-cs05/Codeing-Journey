import java.util.*;

public class Word_Count_in_a_Sentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.toLowerCase().split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : s) {
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }    
            else{
                map.put(word, 1);
            }    
        }
        System.out.println(map);
    }
}

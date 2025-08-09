import java.util.*;

public class Reverse_words{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("\\ ");
        ArrayList<String> words = new ArrayList<>();
        for (String i : str) {
            words.add(i);
        }
        Collections.reverse(words);
        System.out.println(String.join(" ",words));
    }
}

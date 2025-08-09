import java.util.*;

public class Roman_to_Integer {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int sum = 0;
        for (int i = 0;i < s.length();i++) {
            if (i+1 < s.length() && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))) {
                sum += romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
                i++;
            }
            else {
                sum += romanMap.get(s.charAt(i));
            }
        }
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(romanToInt(st));
    }
}
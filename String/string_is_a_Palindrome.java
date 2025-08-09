import java.util.Scanner;

public class string_is_a_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String s = new String();
        int i = str.length()-1;
        while (i>=0) {
            s+=str.charAt(i);
            i--;
        }
        if(str.equals(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

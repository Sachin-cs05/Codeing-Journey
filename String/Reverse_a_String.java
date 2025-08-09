import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = new String();
        int i = str.length()-1;
        while (i>=0) {
            s+=str.charAt(i);
            i--;
        }
        System.out.println(s);
    }
}

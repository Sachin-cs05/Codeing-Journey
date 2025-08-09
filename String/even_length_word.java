import java.util.*;

public class even_length_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        for(int i = 0;i<s.length;i++){
            if(s[i].length()%2==0){
                System.out.print(s[i]+" ");
            }
        }
    }
}

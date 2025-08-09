import java.util.Scanner;

public class Insert_a_String_into_another_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original_str = sc.nextLine();
        String add_in_original = sc.nextLine();
        int index = sc.nextInt();
        String new_str = new String();
        for(int i = 0;i<original_str.length();i++){
            if(i != index){
                new_str+=original_str.charAt(i);
            }
            else{
                new_str+=add_in_original;
            }
        }
        System.out.println(new_str);
    }
}
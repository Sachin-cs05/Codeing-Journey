public class print_all_permutation {
    public static void main(String[] args) {
        String str ="abca";
        print(str,"");
    }
    public static void print(String str, String ans){
        if(str.length()==0){
            System.out.println(ans+"");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean flag = false;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(j)== ch){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
            String s1 = str.substring(0, i);
            String s2 = str.substring(i+1);
            print(s1+s2, ans+ch);
            }
        }
    }
}

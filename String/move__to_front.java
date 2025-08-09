public class move__to_front {
    public static void main(String[] args) {
        String str = "move#to#front#";
        String move = "";
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='#'){
                move+=str.charAt(i);
            }
            else{
                newstr+=str.charAt(i);
            }
        }
        System.out.println(move+newstr);
    }
}

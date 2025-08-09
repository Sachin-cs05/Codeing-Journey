public class Board_Path {

    public static void BoardPath(int n,int cur,String ans){
        if(cur == n){
            System.out.println(ans+" ");
            return;
        }
        if(cur>n){
            return;
        }
        // BoardPath(n, cur+1, ans+1);
        // BoardPath(n, cur+2, ans+2);
        // BoardPath(n, cur+3, ans+3);
        for (int dice = 1; dice <= 3; dice++) {
            BoardPath(n, cur+dice, ans+dice);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        BoardPath(n, 0, "");
    }
}

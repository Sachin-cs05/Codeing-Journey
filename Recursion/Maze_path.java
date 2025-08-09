public class Maze_path{
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        print_path(0,0,n-1,m-1,"");
    }
    public static void print_path(int cc,int cr,int er, int ec, String ans){
        if(cr == er && cc == ec ){
            System.out.println(ans);
            return;
            
        }
        if(cr>er || cc>ec){
            return;
        }
        print_path(cc+1, cr, er, ec, ans+'H');
        print_path(cc, cr+1, er, ec, ans+'V');
        // int a1 = print_path(cc+1, cr, er, ec, ans);
        // int a2 = print_path(cc, cr+1, er, ec, ans);
        // return a1+a2;
    }
}
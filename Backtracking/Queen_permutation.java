public class Queen_permutation {
    public static void main(String[] args) {
        int n = 4;
        // tq = total queen
        int tq = 2; 
        boolean[] board = new boolean[n];
        permutation(board, tq, 0, "");

    }
    public static void permutation(boolean[] board, int tq, int qpsf, String ans ){
        if (tq==qpsf){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i] == false){
                board[i] = true;
                permutation(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf);
                board[i] = false;
            }
        }
    }
}

public class queen_combination {
    public static void main(String[] args) {
        int n = 4;
        // tq = total queen
        int tq = 2; 
        boolean[] board = new boolean[n];
        combination(board, tq, 0, "",0);

    }
    public static void combination(boolean[] board, int tq, int qpsf, String ans, int idx ){
        if (tq==qpsf){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if(board[i] == false){
                board[i] = true;
                combination(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf, i+1);
                board[i] = false;
            }
        }
    }
}

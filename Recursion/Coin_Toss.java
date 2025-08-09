public class Coin_Toss {
    public static void PrintAnswer(int n , String ans){
        if(n==0){
            System.out.println(ans+" ");
            return;
        }
        PrintAnswer(n-1, ans+"H");
        PrintAnswer(n-1, ans+"T");
    }
    public static void main(String[] args) {
        int n = 3;
        PrintAnswer(n, "");
    }
}

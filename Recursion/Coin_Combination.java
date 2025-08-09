public class Coin_Combination {
    public static void main(String[] args) {
        int[] coin = {2,1,3,5};
        int amount = 4;
        permutation(coin,amount,"",0);
    }
    public static void permutation(int[] coin , int amount, String ans, int idx){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(amount>=coin[i]){
                permutation(coin, amount-coin[i], coin[i]+ans,i);
            }
        }
    }
}

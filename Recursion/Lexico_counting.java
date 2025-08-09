public class Lexico_counting {
    public static void main(String[] args) {
        int n = 1000;
        PrintCounting(0, n);
    }
    public static void PrintCounting(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr == 0){
            i=1;
        }
        for (; i <=9 ; i++) {
            PrintCounting(curr*10+i, n);
        }
    }
}

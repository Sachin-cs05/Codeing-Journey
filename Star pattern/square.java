public class square {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;
        while(row<=star){
            int i = 1;
            while(i<=n){
                System.out.print("* ");
                i+=1;
            }
            row+=1;
            System.out.println();
        }
    }
}

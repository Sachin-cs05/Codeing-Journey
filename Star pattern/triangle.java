public class triangle {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            row+=1;
            star+=1;
            System.out.println();
        }
    }
}

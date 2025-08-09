public class reverse_triangle {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 5;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            row+=1;
            star-=1;
            System.out.println();
        }
    }
}

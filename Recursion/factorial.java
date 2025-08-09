                     // using head recursion
public class factorial{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn = fact(n-1);  
        return n*fn;
    }
}

                     // using tail recursion      

// public class factorial{
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fact(n,1));
//     }public static int fact(int n,int ans){
//         if(n==0){
//             return ans;
//         }
          
//         return fact(n-1,n*ans);
//     }
// }
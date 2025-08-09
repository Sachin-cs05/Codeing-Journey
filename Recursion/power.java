                 // using head recursion 
public class power {
    // public static void main(String[] args) {
    //     int x = 4;
    //     int n = 5;
    //     System.out.println(pow(x, n));
    // }
    // public static int pow(int x, int n){
    //     //  O(n)
    //     if(n==0){
    //         return 1;
    //     }
    //     int a = pow(x,n-1);
    //     return a*x;
    // }


                     // using tail recursion
    
// public class power {
//     public static void main(String[] args) {
//         int x = 4;
//         int n = 5;
//         System.out.println(pow(x, n));
//     }
//  O(n)
//     public static int pow(int x, int n){
//         if(n==0){
//             return x*n;
//         }
//         return pow(n-1,x*n);
//     }
// }

public static void main(String[] args) {
        int x = 3;
        int n = 5;
        System.out.println(pow(x, n));
    }
    public static int pow(int x, int n){
        //  O(log n)
        if(n==0){
            return 1;
        }
        int ans = pow(x, n/2);
        ans = ans*ans;
        if(n%2 != 0){
            ans*=x;
        }
        return ans;
    }
}
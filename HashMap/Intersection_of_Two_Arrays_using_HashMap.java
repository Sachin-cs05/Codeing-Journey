import java.util.*;

public class Intersection_of_Two_Arrays_using_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of first list : ");
        int n1 = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0;i<n1;i++){
            int num1 = sc.nextInt();
            list1.add(num1);
        }
        System.out.print("enter the size of 2nd list : ");
        int n2 = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0;i<n2;i++){
            int num2 = sc.nextInt();
            list2.add(num2);
        }
        list1.retainAll(list2);
        System.out.println(list1);
    }
}

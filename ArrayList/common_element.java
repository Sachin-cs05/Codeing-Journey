import java.util.ArrayList;
import java.util.Scanner;

public class common_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array1 : ");
        int size1 = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < size1; i++) {
            int el = sc.nextInt();
            list1.add(el);
        }
        System.out.print("enter the size of array2 : ");
        int size2 = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < size2; i++) {
            int ele = sc.nextInt();
            list2.add(ele);
        }
        list1.retainAll(list2);
        System.out.println(list1);
    }
}

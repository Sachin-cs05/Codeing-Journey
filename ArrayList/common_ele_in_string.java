import java.util.*;

public class common_ele_in_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of list1 : ");
        int size1 = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < size1; i++) {
            String el = sc.nextLine();
            list1.add(el);
        }
        System.out.print("enter the size of list2 : ");
        int size2 = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < size2; i++) {
            String ele = sc.nextLine();
            list2.add(ele);
        }
        list1.retainAll(list2);
        System.out.println(list1);
    }
}

import java.util.*;
public class use {
    public static void main(String[] args) {
       ArrayList<Integer> ll = new ArrayList<>();

    //    add range 0 to size
       ll.add(12);
       ll.add(13);
       ll.add(14);
       ll.add(2,15);
       Collections.sort(ll); 
       System.out.println(ll);        //method of sort list

       ll.set(2,10);  // use for update value in list
       System.out.println(ll);
       System.out.println(ll.size());

    //    get range 0 to size-1  give ele. by using index
        System.out.println(ll.get(2));
    }
}

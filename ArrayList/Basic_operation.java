import java.util.ArrayList;
import java.util.Iterator;

public class Basic_operation{
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();

        // add four object
        str.add("Apple");
        str.add("mango");
        str.add("orange");
        str.add("guava");

        System.out.println(str);

        // remove operation
        str.remove(3);
        str.remove("Apple");
        System.out.println(str);

        // display str size
        System.out.println("Arraylist size = "+ str.size());

        // str.add("Iterator");
        Iterator it = str.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
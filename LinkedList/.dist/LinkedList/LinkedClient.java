public class LinkedClient {
    public static void main(String[] args) throws Exception {
        LinkedList l= new LinkedList();
        l.addfirst(10);
        l.addfirst(20);
        l.addfirst(30);
        l.addfirst(40);

        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);

        l.addAtindex(88, 2);
        l.Display();
        // System.out.println(l.getAtindex(3));
        // System.out.println(l.getLast());
        // System.out.println(l.getfirst());

        // System.out.println(l.removefirst());
        // System.out.println(l.reomveLast());
        System.out.println(l.removeAtindex(2));
        l.Display();

    }
}

public class Cycle_removel_Algo {
    public class Node{
        int val;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;
    public void addfirst(int item){
        Node nn = new Node();
        nn.val = item;
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
        }
        else{
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void addLast(int item){
        if(size == 0){
            addfirst(item);
        }
        else{
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void Createcycle() throws Exception{
        Node nn = getNode(2);
        tail.next = nn;
    }
    private Node getNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Bklol k out of range hai"); 
        }
        Node temp  = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println(".");
    }

    public Node hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return slow;
        }
        return null;
    }

// O(n^2)
    public void CycleRemovel1(){
        Node meet = hasCycle(head);
        if(meet == null){
            return;
        }
        Node start=head;
        while (start!=null){
            Node temp = meet;
            while(temp.next != meet){
                if(start == temp.next){
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            } 
            start = start.next;
        }
    }


 // O(n)
    public void CycleRemovel2(){
        Node meet = hasCycle(head);
        if(meet == null){
            return;
        }
        int count = 1;
        Node temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        Node fast = head;
        for (int i = 0; i <count; i++) {
            fast = fast.next;
        }
        Node slow = head;
        while (slow.next != fast.next ) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    // O(n) right approach
    public void floyedCycleRemovel(){
        Node meet = hasCycle(head);
        if(meet == null){
            return;
        }
        Node slow = head;
        Node fast = meet;
        while (slow.next != fast.next ) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void main(String[] args) throws Exception {
        Cycle_removel_Algo cl = new Cycle_removel_Algo();
        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addLast(40);
        cl.addLast(50);
        cl.addLast(60);
        cl.addLast(70);
        cl.addLast(80);
        cl.Createcycle();
        // cl.CycleRemovel1();
        // cl.CycleRemovel2();
        cl.floyedCycleRemovel();
        cl.Display();
    }
}

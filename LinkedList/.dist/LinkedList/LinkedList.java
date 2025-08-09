public class LinkedList {

    public class Node{
        int val;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;

    public void addAtindex(int item, int k) throws Exception{
        if(k == 0){
            addfirst(item);
        }
        else if(k == size){
            addLast(item);
        }
        else{
            Node N_1th = getNode(k-1);
            Node nn = new Node();
            nn.val = item;
            nn.next = N_1th.next;
            N_1th.next = nn;  
            size++;
        }
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


    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println(".");
    }

    // O(1) 
    public int getfirst() throws Exception{
        if(head == null){
            throw new Exception("bklol list empty hai");
        }
        return head.val;
    }

// O(1)
    public int getLast() throws Exception{
        if(tail == null){
            throw new Exception("bklol list empty hai");
        }
        return tail.val;
    }

// O(n)
    public int getAtindex(int k) throws Exception{
        return getNode(k).val;
    }

//O(1) 
    public int removefirst(){
        Node temp = head;
        if(size == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            temp.next = null;
        }
        size--;
        return temp.val;
    }

// O(1)
    public int reomveLast() throws Exception{
        if(size == 1){
            return removefirst();
        }
        else{
            Node prev = getNode(size-2);
            Node temp = tail;
            tail = prev;
            tail.next =null;
            size--;
            return temp.val;
        }
    }

    // O(n)
    public int removeAtindex(int k) throws Exception{
        if(k == 0){
            return removefirst();
        }
        else if(k == size-1){
            return reomveLast();
        }
        else{
            Node prev = getNode(k-1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
    }
}
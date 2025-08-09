public class Q_reverse {
    public static void main(String[] args) throws Exception{
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.Display();
        reverse(q);
        q.Display();
    }
    public static void reverse(Queue q) throws Exception{
        if(q.isEmpty()){
            return;
        }
        int ii = q.Dequeue();
        reverse(q);
        q.enqueue(ii);
    }
}

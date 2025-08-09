public class Queue {

    private int[] arr;
    private int front = 0; // ele. remove krne ke liye
    private int size = 0;  // ele. add krne ke liye and size find

    public Queue(){
        this.arr = new int[5];
    }

    public Queue(int n){
        this.arr = new int[n];
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public void enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("bklol queue full hai");
        }
        int idx = (front+size)%arr.length;
         arr[idx] = item;
         size++;
    }

    public int Dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("bklol queue Empty hai");
        }
        int rev = arr[front];
        front = (front+1)%arr.length;
        size--;
        return rev;
    }

    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("bklol queue Empty hai");
        }
        int rev = arr[front];
        return rev;
    }

    public void Display(){
        for(int i = 0;i<size;i++){
            int idx = (front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}

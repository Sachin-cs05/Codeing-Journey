public class Stack {
    private int[] arr;
    private int top = -1;

    public Stack(){
        this.arr = new int[5];
    }

    public Stack(int n){
        this.arr = new int[n];
    }

    public boolean iSEmpty(){
        return top == -1;
    }

    public boolean iSFull(){
        return top == arr.length-1;
    }

    public void push(int item) throws Exception{
        if(iSFull()){
            throw new Exception("Bklol Stack full hogya hai");
        }
        top++;
        arr[top] = item;
    }

    public int pop()throws Exception{
        if(iSEmpty()){
            throw new Exception("Bklol Stack Empty hai");
        }
        int rv = arr[top];
        top--;
        return rv;
    }

    public int peek() throws Exception{
        if(iSEmpty()){
            throw new Exception("Bklol Stack Empty hai");
        }
        int rv = arr[top];
        return rv;
    }

    public int size(){
        return top+1;
    }

    public void Display(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

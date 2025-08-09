public class BST_Client{
    public static void main(String[] args){
        int[] in = {10,20,30,40,50,60,70,80,90};
        BST bst = new BST(in);
        bst.preOrder();
        System.out.println(bst.max());
        System.out.println(bst.find(30));
    }
}
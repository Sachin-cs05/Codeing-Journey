public class Binary_Tree_client {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println(bt.find(80));
        System.out.println(bt.max());
        System.out.println(bt.ht());
        bt.preOrder(); // root, left,right
        bt.postOrder(); // left, right, root
        bt.InOrder(); //  left, root, right
        bt.levelOrder();    
    }
}

import java.util.*;
public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree(){
        root = CreateTree();
    }
    private Node CreateTree(){
        System.out.print("Enter node value: ");
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        System.out.print("Does node " + item + " have a left child? (true/false): ");
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = CreateTree();
        }

        System.out.print("Does node " + item + " have a right child? (true/false): ");
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = CreateTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node node){
        if(node == null){
            return;
        }
        String s = "";
        s = "<--" + node.val + "-->";
        if(node.left != null){
            s = s + node.left.val;
        }
        else{
            s = "." + s;
        }
        if(node.right != null){
            s = node.right.val + s;
        }
        else{
            s = s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }
    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(Node nn,int item){
        if(nn == null){
            return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left || right;
    }
    public int max(){
        return max(this.root);
    }
    private int max(Node nn){
        if(nn == null){
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.val,Math.max(left, right));
    }
    public int ht(){
        return ht(this.root);
    }
    private int ht(Node nn){
        if(nn == null){
            return -1;
        }
        int left = ht(nn.left);
        int right = ht(nn.right);
        return Math.max(left,right)+1;
    }
    public void preOrder(){
        preOrder(this.root);
        System.out.println();
    }
    private void preOrder(Node nn){
        if(nn == null){
            return;
        }
        System.out.println(nn.val + " ");
        preOrder(nn.left);
        preOrder(nn.right);
    }
    public void postOrder(){
        postOrder(this.root);
        System.out.println();
    }
    private void postOrder(Node nn){
        if(nn == null){
            return;
        }
        postOrder(nn.left);
        postOrder(nn.right);
        System.out.println(nn.val + " ");
    }
    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node nn){
        if(nn == null){
            return;
        }
        InOrder(nn.left);
        System.out.println(nn.val + " ");
        InOrder(nn.right);
    }
    public void levelOrder(){
        Queue<Node> q = new LinkedList<>();
        while (!q.isEmpty()) {
            Node rv = q.poll();  // remove first
            System.out.println(rv.val);
            if(rv.left != null){
                q.add(rv.left);
            }
            if(rv.right != null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}

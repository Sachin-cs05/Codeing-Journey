import java.util.*;

public class BinarySearch {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    class BinaryTree {
        TreeNode root;

        public void insert(int val) {
            TreeNode newNode = new TreeNode(val);
            if (root == null) {
                root = newNode;
                return;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode temp = queue.poll();

                if (temp.left == null) {
                    temp.left = newNode;
                    return;
                } else {
                    queue.add(temp.left);
                }

                if (temp.right == null) {
                    temp.right = newNode;
                    return;
                } else {
                    queue.add(temp.right);
                }
            }
        }

        public void levelOrder() {
            if (root == null) return;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                System.out.print(current.val + " ");

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println();
        }

        public int height(TreeNode node) {
            if (node == null) return 0;
            int left = height(node.left);
            int right = height(node.right);
            return Math.max(left, right) + 1;
        }

        public static int countLeaf(TreeNode node){
            if(node == null) return 0;
            if(node.left == null && node.right == null) return 1;
            return countLeaf(node.left) + countLeaf(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        BinaryTree tree = bs.new BinaryTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.println("Level Order Traversal:");
        tree.levelOrder();

        System.out.println("Height: " + tree.height(tree.root));
        System.out.println("leafCount: " + tree.countLeaf(tree.root));
    }
}

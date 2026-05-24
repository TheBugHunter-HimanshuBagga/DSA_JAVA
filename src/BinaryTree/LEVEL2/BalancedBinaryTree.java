package BinaryTree.LEVEL2;

public class BalancedBinaryTree {
    public static void main(String[] args){
        // height diffrence between left and right subtree is at most one
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(isBalancedBT(root));


    }
    static boolean isBalancedBT(Node root){
        if(root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left - right) > 1){
            return false;
        }
        return isBalancedBT(root.left) && isBalancedBT((root.right));
    }
    static Integer height(Node root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        int max = Math.max(left,right);
        return max + 1;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
}

package BinaryTree.LEVEL2;

public class MaximumDepthofBinaryTree {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(maximumDepth(root));

    }
    static Integer maximumDepth(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = maximumDepth(root.left);
        int right = maximumDepth(root.right);
        int max = Math.max(left , right);
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

package BinaryTree.LEVEL2;

public class MinimumDepthofBinaryTree {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(minimumDepth(root));
    }
    static Integer minimumDepth(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1; // leaf condition
        int left = minimumDepth(root.left);
        int right = minimumDepth(root.right);
        int min = Math.min(left , right);
        return min;
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

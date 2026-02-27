package BinaryTree.PracticeCodingShuttle;

public class MinimumDepthBinaryTree {
    public static void main(String[] args){
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        Node n3 = new Node(20);
        Node n4 = new Node(15);
        Node n5 = new Node(7);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

    }
    static int minDepth(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.left == null) return 1 + minDepth(root.right);
        if(root.right == null) return 1 + minDepth(root.left);

        return 1 + Math.max(minDepth(root.left) , minDepth(root.right));
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

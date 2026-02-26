package BinaryTree.PracticeCodingShuttle;

public class MaximumSubTreeSum {
    static int maxSubTree;
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(7);
        Node n6 = new Node(5);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        maxSubTree = Integer.MIN_VALUE;
        count(root);
        System.out.println(maxSubTree);
    }

    public static int count(Node root){
        if(root == null) return 0;
        int leftRoot = count(root.left);
        int rightRoot = count(root.right);
        int currSum = leftRoot + rightRoot + root.data;
        maxSubTree = Math.max(currSum , maxSubTree);
        return currSum;
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
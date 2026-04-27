package BinaryTree.PracticeCodingShuttle;

public class BinaryTreeMaximumPathSum {
    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args){
        Node n1 = new Node(3); Node n2 = new Node(5);
        Node n3 = new Node(1); Node n4 = new Node(6);
        Node n5 = new Node(2); Node n6 = new Node(0);
        Node n7 = new Node(8); Node n8 = new Node(7);
        Node n9 = new Node(4);

        Node root = n1; n1.left = n2;
        n1.right = n3;  n2.left = n4;
        n2.right = n5;  n3.left = n6;
        n3.right = n7;  n5.left = n8;
        n5.right = n9;

    }
    /*
    Given the root of a binary tree,
👉 return the maximum path sum of any path in the tree.
     */
    static int helper(Node root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        left = Math.max(0 , left);
        right = Math.max(0 , right);
        maxSum = Math.max(maxSum , left + right + root.data);
        return root.data + Math.max(left , right);
    }

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
}

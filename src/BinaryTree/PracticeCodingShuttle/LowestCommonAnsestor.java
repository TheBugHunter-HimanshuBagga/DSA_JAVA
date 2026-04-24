package BinaryTree.PracticeCodingShuttle;

public class LowestCommonAnsestor {
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
    public Node helper1(Node root , Node p , Node q){
        // lowest node in the tree that has both p and q as descendents
        if(root == null) return null;
        if(root == p || root == q) return root;
        Node left = helper1(root.left , p , q);
        Node right = helper1(root.right , p , q);
        if(left != null && right != null){
            return root;
        }
        return (left != null) ? left : right;
    }
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
}

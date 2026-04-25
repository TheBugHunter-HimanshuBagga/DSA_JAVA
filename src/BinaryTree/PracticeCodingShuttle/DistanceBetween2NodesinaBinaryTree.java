package BinaryTree.PracticeCodingShuttle;

import com.sun.source.tree.Tree;

public class DistanceBetween2NodesinaBinaryTree {
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


        int ans = distanceBetweeen2Nodes(root , n2, n8);
        System.out.println("Distance: " + ans);
    }
    public static int distanceBetweeen2Nodes(Node root , Node p , Node q){
        Node lca = LCAHelper3(root , p , q);
        int d1 = findDistanceHelper(lca , p);
        int d2 = findDistanceHelper(lca , q);
        return d1+d2;
    }
    public static Node LCAHelper3(Node root , Node p , Node q){
        if(root == null) return null;
        if(p == root || q == root) return root;
        Node left = LCAHelper3(root.left , p , q);
        Node right = LCAHelper3(root.right , p , q);
        if(left != null && right != null) return root;
        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }
        return null;
    }

    public static int findDistanceHelper(Node root , Node target){
        if(root == null) return -1;
        if(target == root) return 0;
        int leftFound = findDistanceHelper(root.left , target);
        int rightFound = findDistanceHelper(root.right, target);
        if(leftFound != -1){
            return leftFound + 1;
        }else if(rightFound != -1){
            return rightFound + 1;
        }return -1;
    }
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}

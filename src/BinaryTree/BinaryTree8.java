package BinaryTree;

import java.util.ArrayList;

import static BinaryTree.BinaryTree7.diameter;

// Ancestors of a node in binary tree
public class BinaryTree8 {
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
        System.out.println(diameter(root));

        ArrayList<Integer> ans = new ArrayList<>();
        ancestors(root , ans , 7);
        System.out.println(ans);

    }
    static boolean ancestors(Node root , ArrayList<Integer> ans , int target){
        if(root == null) return false;
        if(root.data == target) return true;
        boolean isPresentLeft = ancestors(root.left , ans , target);
        boolean isPresentRight = ancestors(root.right , ans , target);
        if(isPresentRight || isPresentLeft){
            ans.add(root.data);
            return true;
        }
        return false;
    }
}

package BinaryTree.LEVEL1;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args){
        // left -> root -> right
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> ans = new ArrayList<>();
        helper(root , ans);
        System.out.println(ans);
    }
    static void helper(Node root , List<Integer> ans){
        if(root == null) return;

        helper(root.left , ans);
        ans.add(root.data);
        helper(root.right , ans);
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

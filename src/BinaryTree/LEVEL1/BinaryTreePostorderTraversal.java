package BinaryTree.LEVEL1;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args){
        // left -> right -> root
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        System.out.println(ans);
    }
    static void helper(Node root , List<Integer> ans){
        if(root == null) return;
        helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.data);
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

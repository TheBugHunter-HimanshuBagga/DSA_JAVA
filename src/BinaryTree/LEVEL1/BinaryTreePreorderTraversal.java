package BinaryTree.LEVEL1;

import java.awt.image.BandedSampleModel;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args){
        // Root -> left -> right
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> answer = new ArrayList<>();

        preorder(root, answer);

        System.out.println(answer);//[1, 2, 4, 5, 3]
    }
    static void preorder(Node root, List<Integer> answer){
        if(root == null) return;
        answer.add(root.data);
        preorder(root.left,answer);
        preorder(root.right, answer);
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

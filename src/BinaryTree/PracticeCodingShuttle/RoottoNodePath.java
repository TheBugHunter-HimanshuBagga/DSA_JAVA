package BinaryTree.PracticeCodingShuttle;

import java.util.ArrayList;
import java.util.List;

public class RoottoNodePath {
    public static void main(String[] args){
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(1);
        Node n4 = new Node(6);
        Node n5 = new Node(2);
        Node n6 = new Node(0);
        Node n7 = new Node(8);
        Node n8 = new Node(7);
        Node n9 = new Node(4);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n5.left = n8;
        n5.right = n9;



    }
//Given a binary tree and an integer target,
//👉 return the path from the root node to the target node

    public List<Integer> rootToNodePath(Node root , int target){
        List<Integer> result = new ArrayList<>();
        helper(root , target , result);
        return result;
    }

    public boolean helper(Node root , int target , List<Integer> result){
        if(root == null) return false; // [] if null
        result.add(root.data); // added currrent node
        if(root.data == target) return true;
        boolean left = helper(root.left , target , result);
        boolean right = helper(root.right , target , result);

        if(left == true || right == true){ // if found
            return true;
        }

        result.remove(result.size() - 1);
        return false;

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

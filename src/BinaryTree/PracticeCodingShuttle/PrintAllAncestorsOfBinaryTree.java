package BinaryTree.PracticeCodingShuttle;

import java.io.Flushable;
import java.util.ArrayList;
import java.util.List;

public class PrintAllAncestorsOfBinaryTree {
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

        PrintAllAncestorsOfBinaryTree obj = new PrintAllAncestorsOfBinaryTree();
        List<Integer> ancestors = obj.gettingAncestors(root , 7);
        System.out.println(ancestors);
    }

    public List<Integer> gettingAncestors(Node root , int target){
        // Traverse tree
        // check : if the target exists there or not
        // if yes , then stop and start returning backwards
        // add that to my list
        List<Integer> result = new ArrayList<>();
        helper(root , target , result);
        return result;

    }

    public boolean helper(Node root , int target , List<Integer> result){
        if(root == null) return false;
        if(root.data == target) return true;
        boolean left = helper(root.left, target, result);
        boolean right = helper(root.right, target, result);
        if(left || right){
            result.add(root.data);
            return true;
        }
        return false;
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

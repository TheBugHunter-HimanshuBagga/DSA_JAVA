package BinaryTree.PracticeCodingShuttle;

import java.util.HashSet;

public class DuplicatesinBinaryTree {

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

        HashSet<Integer> set = new HashSet<>();

        boolean result = duplicateCheck(root , set);

        System.out.println(result);
    }

    private static boolean duplicateCheck(Node node , HashSet<Integer> set){
        if(node == null) return false;

        if(set.contains(node.data)){
            return true;
        }

        set.add(node.data);

        return duplicateCheck(node.left , set) || duplicateCheck(node.right , set);
    }

    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
}
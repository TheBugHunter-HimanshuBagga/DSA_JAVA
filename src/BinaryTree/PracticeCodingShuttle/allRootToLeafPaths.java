package BinaryTree.PracticeCodingShuttle;

import java.util.ArrayList;
import java.util.List;

public class allRootToLeafPaths {
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

        getallRootToLeafPaths(root);

    }
    //Paths
    //🔹 Question
    //
    //Given a binary tree,
    //👉 return all paths from root to every leaf node

    public static List<List<Integer>> getallRootToLeafPaths(Node root){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getallRootToLeafPathsHelper(root , list , result);
        return result;
    }

    public static void getallRootToLeafPathsHelper(Node root , List<Integer> current ,List<List<Integer>> result){
        // root -> current node visiting , current -> storing thr temporary path from root to current node , result -> all completed root to leaf path
        if(root == null) return;
        current.add(root.data);
        if(root.left == null && root.right == null){
            result.add(new ArrayList<>(current));
        }
        getallRootToLeafPathsHelper(root.left , current , result);
        getallRootToLeafPathsHelper(root.right , current , result);
        current.remove(current.size() - 1);
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

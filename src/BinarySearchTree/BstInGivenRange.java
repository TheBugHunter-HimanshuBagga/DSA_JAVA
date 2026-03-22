package BinarySearchTree;

import java.util.ArrayList;

public class BstInGivenRange {
    public static void main(String[] args){

        Node n1 = new Node(8);
        Node n2 = new Node(3);
        Node n3 = new Node(10);
        Node n4 = new Node(1);
        Node n5 = new Node(6);
        Node n6 = new Node(14);
        Node n7 = new Node(4);
        Node n8 = new Node(7);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;
        n5.left = n7;
        n5.right = n8;

        System.out.println(printInRange(root , 5 , 12));
    }

    static ArrayList<Integer> printInRange(Node root , int low , int high){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        if(root.data > low){
            result.addAll(printInRange(root.left , low , high));
        }
        if(root.data >= low && root.data <= high){
            result.add(root.data);
        }
        if(root.data < high){
            result.addAll(printInRange(root.right , low , high));
        }
        return result;
    }

    static void inOrder(Node root , ArrayList<Integer> list){
        if(root == null) return;
        inOrder(root.left , list);
        list.add(root.data);
        inOrder(root.right , list);
    }

    static int minAbsoluteDifferenc1(Node root){ // with extra space
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root , list);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1 ; i < list.size() ; i++){
            minDiff = Math.min(minDiff , list.get(i) - list.get(i-1));
        }
        return minDiff;
    }

    static int minDiff = Integer.MAX_VALUE;
    static Integer prev = null;

    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);

        if(prev != null){
            minDiff = Math.min(minDiff , root.data-prev);
        }
        prev = root.data;

        inOrder(root.right);
    }

    static int minAbsoluteDifference2(Node root){

        inOrder(root);
        return minDiff;
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

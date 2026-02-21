package BinaryTree;
import java.util.*;

import java.util.ArrayList;
import java.util.LinkedList;

// right view and top view of binary tree
public class BinaryTree6 {
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

        ArrayList<Integer> answer = new ArrayList<>();
        rightView(root , 0 , answer);
        System.out.println(answer);
    }
    static void rightView(Node root , int level , ArrayList<Integer> answer){
        if(root == null) return;
        if(level >= answer.size()){
            answer.add(root.data);
        }
        rightView(root.right , level+1 , answer);
        rightView(root.left , level+1 , answer);
    }

    static void rightView2(Node root){
        if(root == null) return ;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 1 ; i <= size ; i++){
                Node temp = q.poll();
                if(i == size){
                    System.out.println(temp.data + " ");
                }
                if(root.left != null) q.add(temp.left);
                if(root.right != null) q.add(temp.right);
            }
        }
    }

    static ArrayList<Integer> topView(Node root){
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>(); // stores in sorted order ..... , -2 , -1 , 0 , 1 , 2 , .....

        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            map.putIfAbsent(curr.horizontalDistance, curr.node.data);

            if(curr.node.left != null){
                q.add(new Pair(curr.horizontalDistance-1,curr.node.left));
            }
            if(curr.node.right != null){
                q.add(new Pair(curr.horizontalDistance+1,curr.node.right));
            }
        }
        return new ArrayList<>(map.values());
    }

    static class Pair{
        int horizontalDistance;
        Node node;

        public Pair(int horizontalDistance , Node node){
            this.horizontalDistance = horizontalDistance;
            this.node = node;
        }
    }
}

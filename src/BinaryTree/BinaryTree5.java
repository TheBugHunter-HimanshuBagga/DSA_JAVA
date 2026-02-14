package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

// Vertical Order Traversal
public class BinaryTree5 {
    public static void main(String[] args) {
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

    }
    static ArrayList<ArrayList<Integer>> verticalOrderTraversal(Node root) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>(); // it helps sorting automatically

        q.add(new Pair(0 , root)); // horizontal distance and node put inside pair
        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(!map.containsKey(curr.horizontalDistance)){
                map.put(curr.horizontalDistance, new ArrayList<>());
            }
            map.get(curr.horizontalDistance).add(curr.node.data);

            if(curr.node.left != null){
                q.add(new Pair(curr.horizontalDistance-1 , curr.node.left));
            }
            if(curr.node.right != null){
                q.add(new Pair(curr.horizontalDistance+1 , curr.node.right));
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
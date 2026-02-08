package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree2 {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    static Node xPar , yPar;
    static int xLevel, yLevel;

    public static void main(String[] args){

        // BUILD TREE
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println(areCousins(root , 4 , 5));

        ArrayList<Integer> ans = new ArrayList<>();
        nodesAtLevelK(root , 2 , ans);
        System.out.println(ans);

        System.out.println(nodesAtLevelK(root , 2));
    }

    static void areCousinsHelper(Node node , Node par , int x , int y , int level){
        if(node == null) return;

        if(node.data == x){
            xPar = par;
            xLevel = level;
        }
        if(node.data == y){
            yPar = par;
            yLevel = level;
        }

        areCousinsHelper(node.left , node , x , y , level+1);
        areCousinsHelper(node.right , node , x , y , level+1);
    }
    static class Pair{
        Node node;
        int level;

        public Pair(Node node , int level){
            this.node = node;
            this.level = level;
        }
    }

    static void nodesAtLevelK(Node root , int level){
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayDeque<Pair> stack = new ArrayDeque<>();

        Pair first = new Pair(root , level);
        stack.push(first);

        while(!stack.isEmpty()){
            Pair curr = stack.poll();
            if(curr.level == 0){
                ans.add(curr.node.data);
            }
            stack.push(new Pair(curr.node.right , curr.level-1));
            stack.push(new Pair(curr.node.left , curr.level-1));
        }
    }

    static boolean areCousins(Node root , int x , int y){
        areCousinsHelper(root , null , x , y , 0);
        return xLevel == yLevel && xPar != yPar;
    }

    static void nodesAtLevelK(Node root , int level , ArrayList<Integer> ans){
        if(root == null || level < 0) return ;
        if(level == 0){
            ans.add(root.data);
            return;
        }
        nodesAtLevelK(root.left , level-1 , ans);
        nodesAtLevelK(root.right , level-1 , ans);
    }
}

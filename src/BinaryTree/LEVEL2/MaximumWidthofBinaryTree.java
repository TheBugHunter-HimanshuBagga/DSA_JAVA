package BinaryTree.LEVEL2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumWidthofBinaryTree {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(maxWidthOfBinaryTree(root));

    }
    static Integer maxWidthOfBinaryTree(Node root){
        if(root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root , 1));
        int maxWidth = 0;
        while(!q.isEmpty()){
            int size = q.size();
            long firstIdx = 0;
            long lastIdx = 0;
            for(int i = 0 ; i < size ; i++){
                Pair curr = q.poll();
                if(i == 0){
                    firstIdx = curr.index;
                }
                if(i == size -1){
                    lastIdx = curr.index;
                }
                if(curr.node.left != null){
                    q.offer(new Pair(curr.node.left ,  2* curr.index));
                }
                if(curr.node.right != null){
                    q.offer(new Pair(curr.node.right , 2* curr.index+1));
                }
            }
            int width = (int) (lastIdx - firstIdx + 1);
            maxWidth = Math.max(maxWidth,width);
        }
        return maxWidth;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    static class Pair{
        Node node;
        int index;
        public Pair(Node node , int index){
            this.node = node;
            this.index = index;
        }
    }
}

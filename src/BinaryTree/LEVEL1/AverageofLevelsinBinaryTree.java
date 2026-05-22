package BinaryTree.LEVEL1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Double> answer = avgOfLvl(root);
        System.out.println(answer);
    }
    static List<Double> avgOfLvl(Node root){
        List<Double> answer = new ArrayList<>();
        if(root == null) return answer; // []
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            for(int i = 0 ; i < size ; i++){
                Node polled = q.poll();
                sum += polled.data;

                if(polled.left != null)
                    q.add(polled.left);
                if(polled.right != null)
                    q.add(polled.right);
            }
            answer.add((double) sum/size);
        }
        return answer;
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

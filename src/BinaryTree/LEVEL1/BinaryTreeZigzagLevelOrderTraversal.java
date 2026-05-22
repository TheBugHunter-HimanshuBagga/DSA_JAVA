package BinaryTree.LEVEL1;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<List<Integer>> answer = helper(root , 0);
        System.out.println(answer);
    }
    static List<List<Integer>> helper(Node root , int level){
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null) return answer; // [[]]
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> lvl = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                Node popped = queue.poll();
                lvl.add(popped.data);//[1]
                if(popped.left != null)
                    queue.add(popped.left);
                if(popped.right != null)
                    queue.add(popped.right);
            }
            if(level % 2 == 1) Collections.reverse(lvl);
            answer.add(lvl);
            level++;
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

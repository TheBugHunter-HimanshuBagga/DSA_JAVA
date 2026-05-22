package BinaryTree.LEVEL1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> answer = RightSideView(root);
        System.out.println(answer);
    }
    static List<Integer> RightSideView(Node root){
        List<Integer> answer = new ArrayList<>();
        if(root == null) return answer;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ; i++){
                Node popped = queue.poll();
                if( i == size - 1) answer.add(popped.data);
                if(popped.left != null)
                    queue.add(popped.left);
                if(popped.right != null)
                    queue.add(popped.right);
            }
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

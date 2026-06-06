package BinaryTree.LEVEL1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class IterativeBinaryTreePostorderTraversal {
    public static void main(String[] args){
        // left -> right -> root
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> answer = helper(root);
        System.out.println(answer);
    }
    static List<Integer> helper(Node root){
        List<Integer> answer = new ArrayList<>();
        if(root == null) return answer;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node popped = stack.pop();
            answer.add(popped.data);
            if(popped.left != null){
                stack.add(popped.left);
            }
            if(popped.right != null){
                stack.add(popped.right);
            }
        }
        Collections.reverse(answer);
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

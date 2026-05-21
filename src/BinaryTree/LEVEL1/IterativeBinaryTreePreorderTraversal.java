package BinaryTree.LEVEL1;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeBinaryTreePreorderTraversal {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> answer = helper(root);
        System.out.println(answer);

    }
    static List<Integer> helper(Node root){

        List<Integer> result = new ArrayList<>(); // all answers

        if(root == null) return result;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node popped = stack.pop();
            result.add(popped.data);

            if(popped.right != null){
                stack.push(popped.right);
            }
            if(popped.left != null){
                stack.push(popped.left);
            }
        }
        return result;
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

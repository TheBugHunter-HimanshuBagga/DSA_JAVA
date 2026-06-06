package BinaryTree.LEVEL1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeBinaryTreeInorderTraversal {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> answer = inOrderHelper(root);
        System.out.println(answer);

    }

    static List<Integer> inOrderHelper(Node root){
        List<Integer> answer  = new ArrayList<>();
        if(root == null) return answer;
        Stack<Node> stack = new Stack<>();

        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            Node popped = stack.pop();
            answer.add(popped.data);

            root = popped.right;

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

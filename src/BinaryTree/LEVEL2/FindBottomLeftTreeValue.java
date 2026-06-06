package BinaryTree.LEVEL2;

import java.util.*;

public class FindBottomLeftTreeValue {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println();

    }
    static int helperBfs(Node root){
        if(root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int ans = root.data;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node polled = queue.poll();
                if(i == 0){
                    ans = polled.data;
                }
                if(polled.left != null){
                    queue.add(polled.left);
                }
                if(polled.right !=null){
                    queue.add(polled.right);
                }
            }
        }
        return ans;
    }
//    static int helperDFS(Node root){
//        if(root == null) return 0;
//        Stack<Node> st = new Stack<>();
//        Node curr = root;
//        while(curr != null){
//            st.push(curr);
//            curr = curr.left;
//        }
//        Node popped = st.pop();
//        return popped.data;
//    }
    static int helperDFS(Node root , int depth){
        if(root == null) return 0;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        int left = helperDFS(root.left , depth + 1);
        int right = helperDFS(root.right , depth + 1);
        int max = Math.max();

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

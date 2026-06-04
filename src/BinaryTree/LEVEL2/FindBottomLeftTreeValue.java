package BinaryTree.LEVEL2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
}

package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Level Order Traversal - BFS
public class BinaryTree4 {
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(7);
        Node n6 = new Node(5);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        ArrayList<Integer> ans = levelOrderTraversal(root);
        System.out.println(ans);
        ArrayList<ArrayList<Integer>> answer = levelOrderTraversal2(root);
        System.out.println(answer);
    }
    static ArrayList<ArrayList<Integer>> levelOrderTraversal2(Node root){
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return answer;
        q.add(root);
        q.add(null);
        ArrayList<Integer> currList = new ArrayList<>();
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null){
                answer.add(currList);
                if(q.isEmpty()){
                    break;
                }
                currList = new ArrayList<>();
                q.add(null);
            }else{
                currList.add(curr.data);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return answer;
    }

    static ArrayList<Integer> levelOrderTraversal(Node root){
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        if(root == null) return answer;

        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            answer.add(curr.data);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        return answer;
    }
}

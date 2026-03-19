package BinarySearchTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GivenTargetSum {

    public static void main(String[] args) {

        Node n1 = new Node(15);
        Node n2 = new Node(10);
        Node n3 = new Node(8);
        Node n4 = new Node(12);
        Node n5 = new Node(20);
        Node n6 = new Node(16);
        Node n7 = new Node(25);

        Node root = n1;

        n1.left = n2;
        n1.right = n5;
        n2.left = n3;
        n2.right = n4;
        n5.left = n6;
        n5.right = n7;

        System.out.println(twoSumBST(root , 22));

    }

    static boolean twoSumBST(Node root , int target){
        Node cur1 = root , cur2 = root;
        boolean done1 = false , done2 = false;
        int val1 = 0 , val2 = 0;

        ArrayDeque<Node> s1 = new ArrayDeque<>();
        ArrayDeque<Node> s2 = new ArrayDeque<>();

        while(true){
            // LNR
            while(done1 == false){
                if(cur1 != null){
                    s1.push(cur1);
                    cur1 = cur1.left;
                } else{
                    if(s1.isEmpty()){
                        done1 = true;
                    }else{
                        Node pop = s1.pop();
                        val1 = pop.data;
                        cur1 = pop.right;
                        done1 = true;
                    }

                }
            }

            // RNL
            while(done2 == false){
                if(cur2 != null){
                    s2.push(cur2);
                    cur2 = cur2.right;
                } else{
                    if(s2.isEmpty()){
                        done2 = true;
                    }else{
                        Node pop = s2.pop();
                        val2 = pop.data;
                        cur2 = pop.left;
                        done2 = true;
                    }

                }
            }

            if(val1 != val2 && val1 + val2 == target){
                return true;
            }else if(val1 + val2 < target){
                done1 = false;
            }else if(val1 + val2 > target){
                done2 = false;
            }

            if(val1 >= val2){
                return false;
            }

        }
    }

    public void inOrder(Node root , List<Integer> list){
        // converting the BST to the array and then using the 2 pointer approach getting the answer
        if(root == null) return;
        inOrder(root.left , list);
        System.out.println(root.data);
        inOrder(root.right , list);
    }

    public boolean findPair(Node root , int target){
        List<Integer> list = new ArrayList<>();
        inOrder(root , list);

        int i = 0 , j = list.size() - 1;
        while(i < j){
            int sum = list.get(i) + list.get(j);
            if(sum == target){
                System.out.println("Pair: " + list.get(i) + " , " + list.get(j));
                return true;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
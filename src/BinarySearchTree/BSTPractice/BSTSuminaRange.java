package BinarySearchTree.BSTPractice;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.val = data;
        left = null;
        right = null;
    }
}

public class BSTSuminaRange {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        //You can code here

        // BST
        // given -  root,  int(low , high) .
        // return - sum of values which lies in the range

        if(root == null) return 0; // base

        List<Integer> list = new ArrayList<>();
        inOrder(root , list); // [..........]

        int sum = 0;

        for(int num : list){
            if(num >= low && num <= high){
                sum = sum + num;
            }
        }
        return sum;
    }
    static void inOrder(TreeNode root , List<Integer> list){
        if(root == null) return ;
        inOrder(root.left , list);
        list.add(root.val);
        inOrder(root.right , list);
    }
}
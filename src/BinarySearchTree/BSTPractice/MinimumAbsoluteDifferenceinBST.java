package BinarySearchTree.BSTPractice;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// for BST
public class MinimumAbsoluteDiffrenceinBST {
    int minDiff = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        //You can code here

        inOrder(root); // []
        return minDiff;

    }
    void inOrder(TreeNode root){ // [1,2,3,4,6] -> i can compare it easily
        if(root == null) return;
        inOrder(root.left);


        if(prev != null){
            minDiff = Math.min(minDiff , root.val - prev);
        }

        // if my prev == null by chance then
        prev = root.val;

        inOrder(root.right);

    }
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
}

// for ALL general Trees

public class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        collect(root, list); // if it is a BST it will be sorted

        Collections.sort(list); // if not the BST then sort it any ways

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, list.get(i) - list.get(i - 1));
        }

        return minDiff;
    }

    void collect(TreeNode root, List<Integer> list) {
        if (root == null) return;

        collect(root.left, list);
        list.add(root.val);
        collect(root.right, list);
    }
}
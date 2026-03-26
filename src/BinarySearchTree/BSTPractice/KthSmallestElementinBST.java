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
public class KthSmallestElementinBST {
    public static int kthSmallest(TreeNode root, int k) {
        //You can code here

        // given - root , k
        // return -
        // -1

        List<Integer> list = new ArrayList<>();
        inOrder(root , list);// sorted

        if(k > list.size()) return -1;

        return list.get(k-1);
    }
    static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inOrder(root.left, list);
        list.add(root.val);  // store node
        inOrder(root.right, list);
    }
}
import javax.swing.tree.TreeNode;
import java.util.*;

/* class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.val = data;
		left = null;
		right = null;
	}
} */

import java.util.*;


public class IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {

        List<TreeNode> list = new ArrayList<>();
        inOrder(root, list); // store nodes in sorted order

        for (int i = 0; i < list.size(); i++) {
            list.get(i).left = null;

            if (i + 1 < list.size()) {
                list.get(i).right = list.get(i + 1);
            } else {
                list.get(i).right = null;
            }
        }

        return list.get(0);
    }

    static void inOrder(TreeNode root, List<TreeNode> list) {
        if (root == null) return;

        inOrder(root.left, list);
        list.add(root);  // store node
        inOrder(root.right, list);
    }
}
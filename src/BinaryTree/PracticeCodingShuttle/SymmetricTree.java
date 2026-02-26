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

import javax.swing.tree.TreeNode;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        //You can code here
        if(root == null) return false;
        return helper(root.left , root.right);
    }
    static boolean helper(TreeNode p , TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return helper(p.left , q.right) && helper(p.right , q.left);
    }
}
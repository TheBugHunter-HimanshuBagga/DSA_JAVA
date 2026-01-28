import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        // balanced if |(leftSubtree) - (rightSubtree)| <= 1
        // |2 - 3| = 1
        return height(root) != -1;
    }
    private int height(TreeNode root){
        if(root == null) return 0;

        int leftheight = height(root.left);
        if(leftheight == -1) return -1;

        int rightheight = height(root.right);
        if(rightheight == -1) return -1;

        if(Math.abs(leftheight - rightheight) > 1) return -1;

        return 1 + Math.max(leftheight, rightheight);
    }
}
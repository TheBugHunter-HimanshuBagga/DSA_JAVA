package BinarySearchTree.BSTPractice;

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

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean isBST(TreeNode root, long min, long max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) return false;

        return isBST(root.left, min, root.val) &&
                isBST(root.right, root.val, max);
    }
}
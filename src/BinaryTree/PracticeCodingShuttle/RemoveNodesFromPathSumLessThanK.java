import javax.swing.tree.TreeNode;

public class Solution {

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return dfs(root, 0, limit);
    }

    private TreeNode dfs(TreeNode root, int sum, int limit) {
        if (root == null) return null;

        sum += root.val;

        // leaf node
        if (root.left == null && root.right == null) {
            if (sum < limit) return null;
            return root;
        }

        root.left = dfs(root.left, sum, limit);
        root.right = dfs(root.right, sum, limit);

        if (root.left == null && root.right == null)
            return null;

        return root;
    }
}
import javax.swing.tree.TreeNode;
import java.util.*;

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
class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        return helper(0, 0, root);
    }

    static List<List<Integer>> helper(int row, int col, TreeNode root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(0, root));

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            if (!map.containsKey(curr.horizontalDistance)) {
                map.put(curr.horizontalDistance, new ArrayList<>());
            }

            map.get(curr.horizontalDistance).add(curr.node.val);

            if (curr.node.left != null) {
                q.add(new Pair(curr.horizontalDistance - 1, curr.node.left));
            }

            if (curr.node.right != null) {   // FIXED
                q.add(new Pair(curr.horizontalDistance + 1, curr.node.right));
            }
        }

        return new ArrayList<>(map.values());
    }

    static class Pair {
        int horizontalDistance;
        TreeNode node;

        public Pair(int horizontalDistance, TreeNode node) {
            this.horizontalDistance = horizontalDistance;
            this.node = node;
        }
    }
}
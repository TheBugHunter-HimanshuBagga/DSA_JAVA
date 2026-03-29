package BinaryTree.PracticeCodingShuttle;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TopView {

    static List<Integer> TopViewHelper(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Map<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        int min = 0, max = 0;

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();

            if (!map.containsKey(p.hd)) {
                map.put(p.hd, p.node.val);
            }

            min = Math.min(min, p.hd);
            max = Math.max(max, p.hd);

            if (p.node.left != null) {
                q.add(new Pair(p.node.left, p.hd - 1));
            }

            if (p.node.right != null) {
                q.add(new Pair(p.node.right, p.hd + 1));
            }
        }

        for (int i = min; i <= max; i++) {
            result.add(map.get(i));
        }

        return result;
    }

    static List<Integer> TopViewHelper1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            if (!map.containsKey(p.hd)) {
                map.put( p.hd , p.node.val);
            }
            // if contains do nothing
            if (p.node.left != null) {
                q.add(new Pair(p.node.left, p.hd - 1));
            }
            if (p.node.right != null) {
                q.add(new Pair(p.node.right, p.hd + 1));
            }
        }
        result.addAll(map.values());
        return result;
    }

    static class Pair {
        TreeNode node;
        int hd;

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}


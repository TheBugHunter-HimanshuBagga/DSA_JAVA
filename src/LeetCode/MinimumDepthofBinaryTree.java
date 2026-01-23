package LeetCode;

import javax.swing.tree.TreeNode;

public class MinimumDepthofBinaryTree {
    public static int minDepth(TreeNode root){
        int rightDepth ;
        int leftDepth ;
        if(root == null){
            return 0;
        }
        if(root.right == null){
            rightDepth = 0;
            leftDepth = 1 + minDepth(root.left);
            return leftDepth;
        }
        else if(root.left == null){
            leftDepth = 0;
            rightDepth = 1 + minDepth(root.right);
            return rightDepth;
        }
        else{
            leftDepth = minDepth(root.left);
            rightDepth = minDepth(root.right);
            return 1 + Math.min(leftDepth , rightDepth);
        }
    }
}

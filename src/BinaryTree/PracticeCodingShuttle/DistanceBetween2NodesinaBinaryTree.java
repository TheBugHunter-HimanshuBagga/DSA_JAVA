package BinaryTree.PracticeCodingShuttle;

public class DistanceBetween2NodesinaBinaryTree {
    public static void main(String[] args){
        LowestCommonAnsestor.Node n1 = new LowestCommonAnsestor.Node(3); LowestCommonAnsestor.Node n2 = new LowestCommonAnsestor.Node(5);
        LowestCommonAnsestor.Node n3 = new LowestCommonAnsestor.Node(1); LowestCommonAnsestor.Node n4 = new LowestCommonAnsestor.Node(6);
        LowestCommonAnsestor.Node n5 = new LowestCommonAnsestor.Node(2); LowestCommonAnsestor.Node n6 = new LowestCommonAnsestor.Node(0);
        LowestCommonAnsestor.Node n7 = new LowestCommonAnsestor.Node(8); LowestCommonAnsestor.Node n8 = new LowestCommonAnsestor.Node(7);
        LowestCommonAnsestor.Node n9 = new LowestCommonAnsestor.Node(4);

        LowestCommonAnsestor.Node root = n1; n1.left = n2;
        n1.right = n3;  n2.left = n4;
        n2.right = n5;  n3.left = n6;
        n3.right = n7;  n5.left = n8;
        n5.right = n9;
    }
    public static TreeNode LCAHelper3(TreeNode root , TreeNode p , TreeNode q){
        if(root == null) return null;
        if(p == root || q == root) return root;
        TreeNode left = LCAHelper3(root.left , p , q);
        TreeNode right = LCAHelper3(root.right , p , q);
        if(left != null && right != null){ // “Found one target in left and one in right”
            return root;
        }
        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        return null;
    }

    public static int findDistanceHelper(TreeNode root , TreeNode target){

    }
}

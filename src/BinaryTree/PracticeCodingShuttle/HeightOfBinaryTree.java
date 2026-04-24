package BinaryTree.PracticeCodingShuttle;

public class HeightOfBinaryTree {
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
    public static int helperOfBT(TreeNode root){
        if(root == null) return 0;
        int leftHeight = helperOfBT(root.left);
        int rightHelper = helperOfBT(root.right);
        return Math.max(leftHeight , rightHelper) + 1;
    }
}

package BinarySearchTree.BSTPractice;
import java.util.*;
import java.util.function.BinaryOperator;

public class RecoverBST {
    static class TreeNode{
        int val;
        TreeNode left , right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        RecoverBST obj = new RecoverBST();
        System.out.println("Before : ");
        obj.printInOrder(root);

        obj.recover(root);

        System.out.println("After : ");
        obj.printInOrder(root);
    }
    TreeNode prev;
    TreeNode first;
    TreeNode second;
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left); // calling for full left i will definately get the prev
        if(prev != null && prev.val > root.val){ // definately an anamoly
            if(first == null){ // which is nulll in first case then
                first = prev;
            }
            second = root;
        }
        prev = root;
        inOrder(root.right);
    }
    public void recover(TreeNode root){
        inOrder(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void printInOrder(TreeNode root){
        if(root == null) return;
        printInOrder(root.left);
        System.out.println(root.val);
        printInOrder(root.right);
    }
}

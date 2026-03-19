package BinarySearchTree;

import javax.swing.tree.TreeNode;
import java.util.List;

public class ArrayTOBst {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        Node root = toBst(arr , 0 , arr.length-1);
        inOrder(root);
    }
    static Node toBst(int arr[] , int l , int r){
        if(l > r) return null;
        int middle = (l+r)/2;
        Node root = new Node(arr[middle]);
        root.left = toBst(arr ,  l ,  middle-1);
        root.right = toBst(arr ,  middle+1 ,  r);
        return root;
    }

    // PreOrder to BST root , left , right
    static Node createBSTFromPreOrderTraversal(int arr[] , int l , int r){

        if(l > r) return null;
        Node root = new Node(arr[l]);
        int i = l+1;
        for( ; i <= r ; i++){
            if(arr[i] > arr[l]) break;
        }
        root.left = createBSTFromPreOrderTraversal(arr , l+1 , i-1);
        root.right = createBSTFromPreOrderTraversal(arr , i , r);
        return root;
    }

    // PostOrder Left - Right - Node
    static Node createBSTFromPostOrderTraversal(int arr[] , int l , int r){

        if(l > r) return null;
        Node root = new Node(arr[r]);
        int i = r - 1;
        for(; i >= l ; i--){
            if(arr[i] < arr[r]) break;
        }
        root.left = createBSTFromPostOrderTraversal(arr , l , i);
        root.right = createBSTFromPostOrderTraversal(arr , i+1 , r-1);
        return root;
    }

    static void inOrder(Node root){
        // converting the BST to the array and then using the 2 pointer approach getting the answer
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
}

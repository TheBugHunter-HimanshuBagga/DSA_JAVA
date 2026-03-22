package BinarySearchTree;

import java.security.Key;

public class AVL {
    public static void main(String[] args){

    }

    static Node leftRotate(Node x){
        Node y = x.right;
        Node A = y.left;

        // left rotate
        y.left = x;
        x.right = A;

        x.height = height(x);
        y.height = height(y);

        return y;
    }

    static Node rightRotate(Node x){
        Node B = x.right;
        Node y = x.left;

        // right rotate
        y.right = x;
        x.left = B;

        x.height = height(x);
        y.height = height(y);

        return y;
    }

    static int height(Node a){
        int heightLeft = a.left == null ? 0 : a.left.height;
        int heightRight = a.right == null ? 0 : a.right.height;

        return Math.max(heightLeft , heightRight) + 1;
    }

    static Node insertAVL(Node root , int key){
        if(root == null){
            return new Node(key);
        }
        if(key < root.data){
            root.left = insertAVL(root.left , key);
        }else if(key > root.data){
            root.right = insertAVL(root.right , key);
        }else{
            return root;
        }

        // Balancing the BST created to an AVL tree
        root.height = height(root);
        int hb = height(root.left) - height(root.right);

        if(hb > 1 && key < root.left.data){
            return rightRotate(root);
        }
        if(hb < -1 && key > root.right.data){
            return leftRotate(root);
        }
        if(hb > 1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if(hb < -1 && key < root.left.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
    }

    static class Node{
        int data , height;
        Node left , right;
        public Node(int data){
            this.data = data;
        }
    }
}

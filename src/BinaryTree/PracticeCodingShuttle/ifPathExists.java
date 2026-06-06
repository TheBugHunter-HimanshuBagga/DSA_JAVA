package BinaryTree.PracticeCodingShuttle;

public class ifPathExists {
    public static void main(){
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(1);
        Node n4 = new Node(6);
        Node n5 = new Node(2);
        Node n6 = new Node(0);
        Node n7 = new Node(8);
        Node n8 = new Node(7);
        Node n9 = new Node(4);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n5.left = n8;
        n5.right = n9;
        ifPathExistsHelper(root , 7);
    }
    static boolean ifPathExistsHelper(Node root , int target){
        if(root == null) return false;
        if(root.data == target) return true;
        boolean existsLeft = ifPathExistsHelper(root.left , target);
        boolean existsRight = ifPathExistsHelper(root.right , target);
        if(existsLeft || existsRight) return true;
        return false;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
}

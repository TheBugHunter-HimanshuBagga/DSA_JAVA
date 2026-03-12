package BinarySearchTree;


public class Search {
    public static void main(){
        Node n1 = new Node(8);
        Node n2 = new Node(3);
        Node n3 = new Node(10);
        Node n4 = new Node(1);
        Node n5 = new Node(6);
        Node n6 = new Node(14);
        Node n7 = new Node(4);
        Node n8 = new Node(7);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;
        n5.left = n7;
        n5.right = n8;

        System.out.println(Search(root , 60));
    }

    static boolean Search(Node root , int key){
        if(root == null) return false;
        if(root.data == key) return true;
        if(root.data > key){
             return Search(root.left , key);
        }
        if(root.data < key){
            return Search(root.right , key);
        }
        return true;
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

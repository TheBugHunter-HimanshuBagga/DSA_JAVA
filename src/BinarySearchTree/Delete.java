package BinarySearchTree;

public class Delete {
    public static void main(){
        // multiple cases 1. leaf node , 2. Single Child Node , 3. 2 Children - get the inorder successor the replace the node with the inorder succesor
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

        System.out.println();
        delete(root , 14);

    }
    static Node delete(Node root , int key){
        if(root == null) return null;
        if(root.data > key){
            root.left = delete(root.left , key);
        }
        else if(root.data < key){
            root.right = delete(root.right , key);
        }else{ // Node found to be deleted
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.right;
            }
            Node inOrderSuccessor = smallestNode(root.right);
            root.data = inOrderSuccessor.data;
            root.right = delete(root.right , inOrderSuccessor.data);
        }
        return root;
    }

    static Node smallestNode(Node root){
        Node temp = root;
        while(root != null){
            temp = temp.left;
        }
        return temp;
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

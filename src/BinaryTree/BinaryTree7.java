package BinaryTree;
// Diameter of binary tree-> Length of Longest path between between the two nodes in a tree Leaf-leaf
public class BinaryTree7 {
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(7);
        Node n6 = new Node(5);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        System.out.println(diameter(root));
    }
    static int diameter(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diameterMiddle = leftHeight+rightHeight;
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        return Math.max(Math.max(leftDiameter , rightDiameter) , diameterMiddle);
    }
    static int height(Node root){
        if(root == null) return 0;
        int hl = height(root.left);
        int hr = height(root.right);
        return Math.max(hl,hr) + 1;
    }
}

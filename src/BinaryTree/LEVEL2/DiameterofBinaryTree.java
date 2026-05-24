package BinaryTree.LEVEL2;

public class DiameterofBinaryTree {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(diameterOfBT(root));

    }
    static int diameter = 0;
    static Integer diameterOfBT(Node root){
        if(root == null) return 0;
        int leftDiameter = diameterOfBT(root.left);
        int rightDiameter = diameterOfBT(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diameter = leftHeight + rightHeight;
        return Math.max(diameter , Math.max(leftDiameter , rightDiameter));
    }
    static Integer height(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int maxHeight = Math.max(leftHeight , rightHeight);
        return maxHeight+1;
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

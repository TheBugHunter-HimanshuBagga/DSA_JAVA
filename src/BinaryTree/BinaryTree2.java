package BinaryTree;

public class BinaryTree2 {
    public static void main(String[] args){

    }

    static Node xPar , yPar;
    static int xLevel, yLevel;

    static void areCousinsHelper(Node node , Node par , int x , int y , int level){
        if(node == null) return;

        if(node.data == x){
            xPar = par;
            xLevel = level;
        }
        if(node.data == y){
            yPar = par;
            yLevel = level;
        }
        areCousinsHelper(node.left , node , x , y , level+1);
        areCousinsHelper(node.right , node , x ,y , level+1);
    }

    static boolean areCousins(Node root , int x , int y){
        areCousinsHelper(root , null , x , y , 0);
        boolean onSameLevel = xLevel == yLevel;
        boolean diffrentParents = xPar != yPar;
        return onSameLevel && diffrentParents; // if true then cousins
    }

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
}



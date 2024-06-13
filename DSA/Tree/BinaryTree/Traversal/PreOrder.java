package DSA.Tree.BinaryTree.Traversal;

public class PreOrder {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node CreatTree(int data){
        return new Node(data);

    }

    public static void PreOrder(Node root){
        if(root!=null){
            System.out.println(root.data);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = CreatTree(1);
        Node p1 = CreatTree(2);
        Node p2 = CreatTree(3);
        Node p3 = CreatTree(4);
        Node p4 = CreatTree(5);

        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;

        PreOrder(root);


        
    }
}

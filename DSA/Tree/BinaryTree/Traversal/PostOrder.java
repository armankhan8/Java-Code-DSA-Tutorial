package DSA.Tree.BinaryTree.Traversal;

public class PostOrder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node MakeTree(int data){
        return new Node(data);
    }

    public static void PostOrder(Node root){
        if(root != null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        Node root = MakeTree(20);
        Node l1 = MakeTree(220);
        Node l2 = MakeTree(30);
        Node l3 = MakeTree(40);
        Node l4 = MakeTree(50);

        root.left = l1;
        root.right = l2;
        l1.left = l3;
        l1.right = l4;

        PostOrder(root);
    }
    
}

package DSA.Tree.BinaryTree.Traversal;

public class Inorde {

    static class Node{
        int data;
        
        Node right, left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;

        }
    }

    public static Node MakingTree(int data){
        return new Node(data);
    }

    public static void Inorde(Node root){
        if(root!=null){
            Inorde(root.left);
            System.out.println(root.data + " ");
            Inorde(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = MakingTree(1);
        Node l1 = MakingTree(12);
        Node l2 = MakingTree(13);
        Node l3 = MakingTree(14);
        Node l4 = MakingTree(15);

        root.left = l1;
        root.right = l2;

        l1.left = l3;
        l1.right = l4;
        Inorde(root);
    }
    
}

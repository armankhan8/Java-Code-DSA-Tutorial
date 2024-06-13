package DSA.Tree.BinarySearchTree;

public class BuildBST{
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void Inorder(Node root) {
        if (root != null) {
            Inorder(root.left);
            System.out.println(root.data);
            Inorder(root.right);
        }
    }
    public static Node MakingBST(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = MakingBST(root.left, val);
        }
        else{
            root.right = MakingBST(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i<arr.length; i++){
            root = MakingBST(root, arr[i]);
        }
        Inorder(root);
    }
}
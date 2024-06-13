package DSA.Tree.BinarySearchTree;

import java.util.ArrayList;

public class PrintPathRootLeaf{
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
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
    }
    public static Node MakingBST(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }if(root.data > val){
            root.left = MakingBST(root.left, val);
        }else{
            root.right = MakingBST(root.right, val);
        }
        return root;
    }

    public static void Printt(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void PrintPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            Printt(path);
        }else{
            PrintPath(root.left, path);
            PrintPath(root.right, path);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i<arr.length; i++){
            root = MakingBST(root, arr[i]);
        }
        Inorder(root);
        PrintPath(root, new ArrayList<>());
    }
}
package DSA.Tree.BinarySearchTree;

import java.security.Key;

public class KeySearch {
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

    public static boolean searchKey(Node root, int key) {
        // O(H);
        while (root != null) {
            if (root.data > key) {
                root = root.left;
            } else if (root.data < key) {
                root = root.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        Node l1 = new Node(30);
        Node l2 = new Node(70);
        Node l3 = new Node(10);
        Node l4 = new Node(40);

        root.left = l1;
        root.right = l2;
        l1.left = l3;
        l1.right = l4;

        Inorder(root);

        int key = 400; // Key to search for
        if (searchKey(root, key)) {
            System.out.println("Key " + key + " found in the tree.");
        } else {
            System.out.println("Key " + key + " not found in the tree.");
        }

    }
}

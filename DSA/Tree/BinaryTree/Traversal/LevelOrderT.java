package DSA.Tree.BinaryTree.Traversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderT {
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

    static class BinaryT {
        static int ind = -1;

        public static Node BuildT(int[] node) {
            ind++;
            if (node[ind] == -1) {
                return null;
            }

            Node newNode = new Node(node[ind]);
            newNode.left = BuildT(node);
            newNode.right = BuildT(node);

            return newNode;
        }
    }

    public static void LOT(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        // q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            // Not Print Next Line

            // if (currNode == null) {
            // System.out.println();
            // if (!q.isEmpty()) {
            // q.add(null);
            // }
            // } else {

            System.out.print(currNode.data + " ");
            if (currNode.left != null) {
                q.add(currNode.left);
            }
            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
    }
    // }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryT.BuildT(nodes);
        LOT(root);
    }
}

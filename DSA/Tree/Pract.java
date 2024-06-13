package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Pract {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int ind = -1;

        public static Node insert(int[] node){
            ind++;
            if(node[ind] == -1){
                return null;
            }
            Node newnode = new Node(node[ind]);
            newnode.left = insert(node);
            newnode.right = insert(node);

            return newnode;
        }
    }

    public static void lot(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node nd = q.remove();
            System.out.println(nd.data + " ");
            if(nd.left!=null){
                q.add(nd.left);
            }
            if(nd.right != null){
                q.add(nd.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.insert(nodes);
        lot(root);

    }

}

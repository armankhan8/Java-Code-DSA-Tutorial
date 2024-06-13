package DSA.Tree.BinaryTree;

import java.text.CollationElementIterator;
import java.util.LinkedList;
import java.util.Queue;

public class SumofKthLevel {
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

        public static Node BuildT(int node[]) {
            ind++;
            if (node[ind] == -1) {
                return null;
            }

            Node newnNode = new Node(node[ind]);
            newnNode.left = BuildT(node);
            newnNode.right = BuildT(node);

            return newnNode;

        }
    }

    public static int SumofKthlevel(Node root, int k) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 1;
        int sum = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            if (level == k) {
                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();
                    sum += curr.data;
                }
                return sum;
            }

            Node curr = q.remove();
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
            level++;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryT bt = new BinaryT();
        Node root = bt.BuildT(nodes);
        System.out.println(SumofKthlevel(root, 2));
    }
}

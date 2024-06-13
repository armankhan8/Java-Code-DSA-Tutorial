package DSA.Tree.BinaryTree;

public class SumofNode {    
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

    public static int sumNode(Node root) {
        if (root == null) {
            return 0;
        }
        return sumNode(root.left) + sumNode(root.right) + root.data;
    }
    
    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryT bt = new BinaryT();
        Node root = bt.BuildT(node);

        System.out.println(sumNode(root));
    }
}

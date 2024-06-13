package DSA.Tree.BinaryTree;

public class Diamter_Tree {    
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

    public static int Height(Node root) {
        // O(n)
        if (root == null) {
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        // O(n);
        int leftD = diameter(root.left);
        int rightD = diameter(root.right);
        // O(n)
        int rootH = Height(root.left) + Height(root.right) + 1;
        // O(n^2)
        return Math.max(rootH, Math.max(leftD,rightD));
    }
    
    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int node[] = {1,2};
        BinaryT bt = new BinaryT();
        Node root = bt.BuildT(node);

        System.out.println(diameter(root));
    }
}

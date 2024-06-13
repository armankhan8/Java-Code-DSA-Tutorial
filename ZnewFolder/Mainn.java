package ZnewFolder;
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Mainn {
    Node root;

    int maxHeight(Node node) {
        if (node == null) {
            return 0;  // If the tree is empty, return 0
        }
        int leftH = maxHeight(node.left);  // Recursively find the height of the left subtree
        int rightH = maxHeight(node.right);  // Recursively find the height of the right subtree

        return leftH + rightH + 1; 
    }

    public static void main(String[] args) {
        Mainn tree = new Mainn();

        // Create the binary tree structure
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The maximum height of the binary tree is: " + tree.maxHeight(tree.root));
    }
}

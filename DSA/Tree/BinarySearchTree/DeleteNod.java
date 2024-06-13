package DSA.Tree.BinarySearchTree;

public class DeleteNod{
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

    public static Node deletenode(Node root, int val){
        if(root.data > val){
            root.left = deletenode(root.left, val);
        }else if(root.data < val){
            root.right = deletenode(root.right, val);
        }else{
            // Case1 No Lead Node
            if(root.left == null && root.right == null){
                return null;
            }
            // case2 on child only
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case3  2-childern
            Node inOrSuc = inorderSuccsesor(root.right);
            root.data = inOrSuc.data;
            root.right = deletenode(root.right, val);
        }
        return root;
    }

    public static Node inorderSuccsesor(Node root){
        while(root.right != null){
            root = root.right;
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
        deletenode(root, 4);
        System.out.println();
        Inorder(root);
    }
}
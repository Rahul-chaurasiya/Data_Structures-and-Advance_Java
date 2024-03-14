class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class j07_recursive_insert {

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        int x = 20;

        root = insert(root, x);
        inorder(root);
    }

    private static Node insert(Node root, int x) {
        if (root == null) return new Node(x);
        if (x < root.key) root.left = insert(root.left, x);
        else if (x > root.key) root.right = insert(root.right, x);
        return root;
    }

    private static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

}

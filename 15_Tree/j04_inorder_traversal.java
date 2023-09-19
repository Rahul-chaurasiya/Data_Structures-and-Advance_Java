class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class j04_inorder_traversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        inorder(root);
    }

    static void inorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }
}

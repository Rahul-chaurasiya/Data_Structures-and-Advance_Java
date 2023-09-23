
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class j15_left_view_recursion {

    public static void printLeftView(Node root) {
        view(root, 1);
    }

    static int maxlevel = 0;

    public static void view(Node root, int level) {
        if (root == null)
            return;
        if (maxlevel < level) {
            System.out.println(root.key);
            maxlevel = level;
        }
        view(root.left, level + 1);
        view(root.right, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        printLeftView(root);
    }
}

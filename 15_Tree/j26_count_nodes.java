
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

class j26_count_nodes {

    public static int countNode(Node root) {
        if (root == null) return 0;
        else return 1 + countNode(root.left) + countNode(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.print(countNode(root));
    }

}


===================================================================================================================


class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

class j26_count_nodes {

    public static int countNode(Node root) {
        int lh = 0;
        int rh = 0;
        Node curr = root;
        while (curr != null) {
            curr = curr.left;
            lh++;
        }

        curr = root;
        while (curr != null) {
            curr = curr.right;
            rh++;
        }

        if (lh == rh) return (int) Math.pow(2, rh) - 1;
        else return (1 + countNode(root.left) + countNode(root.right));
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.print(countNode(root));
    }

}

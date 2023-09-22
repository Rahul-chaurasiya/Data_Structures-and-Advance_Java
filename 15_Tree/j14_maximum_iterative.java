import java.util.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class j14_maximum_iterative {

    public static int maximum(Node root) {
        if (root == null)
            return 0;
        int max = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty()==false) {
            Node curr = q.poll();
            max = Math.max(max, curr.key);
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println(maximum(root));
    }
}

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

public class j10_level_order_traversal {

    public static void printLevel_recursive(Node root){
        if(root == null) return;
        System.out.print(root.key+" ");
        printLevel_recursive(root.left);
        printLevel_recursive(root.right);
    }

    public static void printLevel_iterative(Node root){
        if(root == null)return ;
        Queue<Node>q = new ArrayDeque<>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr = q.poll();
            System.out.print(curr.key+" ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
    	
        printLevel_recursive(root);
        printLevel_iterative(root);
    }
}

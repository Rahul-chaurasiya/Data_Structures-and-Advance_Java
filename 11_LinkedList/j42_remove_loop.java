
import java.util.HashSet;

public class j42_remove_loop {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node remove_Loop(Node head) {
        Node curr = head;
        Node prev = null;
        HashSet<Node> hs = new HashSet<Node>();
        while (curr != null && curr.next != null) {
            if (hs.contains(curr)){
                prev.next = null;
                break;
            }
            hs.add(curr);
            prev = curr;
            curr = curr.next;
        }
        return head;
    }

    static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
        head= remove_Loop(head);
        traversal(head);
    }

}

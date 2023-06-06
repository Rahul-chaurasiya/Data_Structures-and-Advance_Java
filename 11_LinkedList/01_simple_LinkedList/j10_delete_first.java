
public class j10_delete_first {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node delete_first(Node head) {
        if (head == null)
            return head;
        else
            return head.next;
    }

    static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.print("our current Linkedlist is : ");
        traversal(head);
        head = delete_first(head);
        System.out.println("After Deletation ... ");
        traversal(head);
    }
}


public class j11_delete_end {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node delete_end(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
            
        Node curr = head;
        while (curr.next.next != null)
            curr = curr.next;
        curr.next = null;
        return head;
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
        head = delete_end(head);
        System.out.println("After Deletation ... ");
        traversal(head);
    }
}

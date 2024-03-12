
public class j09_insert_end {
   
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node insert_end(Node head, int x) {
        Node new_head = new Node(x);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_head;
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
        head = insert_end(head, 50);
        System.out.println("After insert at end");
        traversal(head);
    }
}

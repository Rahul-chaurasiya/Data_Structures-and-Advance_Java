
class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

public class j19_reverse_doubly {

    static Node insert_end(Node head, int x) {
        Node temp = new Node(x);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        temp.prev = curr;
        curr.next = temp;

        return head;
    }

    public static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head) {

        if (head == null || head.next == null)
            return head;

        Node temp = null;
        Node curr = head;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }

    public static void main(String args[]) {

        Node head = new Node(10);
        head = insert_end(head, 20);
        head = insert_end(head, 30);
        head = insert_end(head, 40);
        head = insert_end(head, 50);

        System.out.print("our current Linkedlist is : ");
        traversal(head);

        System.out.println("After reversing ... ");
        head = reverse(head);
        traversal(head);

    }

}
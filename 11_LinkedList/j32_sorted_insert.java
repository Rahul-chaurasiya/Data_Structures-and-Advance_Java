
public class j32_sorted_insert {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node insert_sorted(Node head, int x) {

        Node temp = new Node(x);
        if (head == null)
            return temp;

        if (x < head.data) {
            temp.next = head;
            return temp;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;

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
        head.next.next.next.next = new Node(50);

        System.out.print("our current Linkedlist is : ");
        traversal(head);

        head = insert_sorted(head, 45);

        System.out.println("After insert at begenning");
        traversal(head);

    }
}

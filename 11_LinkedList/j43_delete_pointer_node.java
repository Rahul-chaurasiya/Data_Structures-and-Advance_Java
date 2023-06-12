
public class j43_delete_pointer_node {

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
        if (head == null)
            return new_head;

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

    static void delete_at_point(Node point) {
        point.data = point.next.data;
        point.next = point.next.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert_end(head, 20);
        head = insert_end(head, 30);
        head = insert_end(head, 40);
        head = insert_end(head, 50);
        head = insert_end(head, 60);
        head = insert_end(head, 70);
        System.out.print("LinkedList : ");
        traversal(head);

        delete_at_point(head.next.next.next);
        System.out.print("LinkedList after delete Node : ");
        traversal(head);
    }
}

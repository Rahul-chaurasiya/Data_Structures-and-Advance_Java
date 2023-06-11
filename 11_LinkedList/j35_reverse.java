import java.util.ArrayList;

public class j35_reverse {
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

    static Node reverse(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            list.add(curr.data);
        }

        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data = list.remove(list.size() - 1);
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert_end(head, 20);
        head = insert_end(head, 30);
        head = insert_end(head, 40);
        head = insert_end(head, 50);
        head = insert_end(head, 60);
        head = insert_end(head, 70);

        System.out.print("our current Linkedlist is : ");
        traversal(head);

        head = reverse(head);
        System.out.print("Reverse linkedlist is : ");
        traversal(head);
    }
}


=================================================================================


public class j35_reverse {
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

    static Node reverse(Node head) {
        Node temp = null;
        Node curr = head;
        while (curr != null) {
            Node prev = curr.next;
            curr.next = temp;
            temp = curr;
            curr = prev;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert_end(head, 20);
        head = insert_end(head, 30);
        head = insert_end(head, 40);
        head = insert_end(head, 50);
        head = insert_end(head, 60);
        head = insert_end(head, 70);

        System.out.print("our current Linkedlist is : ");
        traversal(head);

        head = reverse(head);
        System.out.print("Reverse linkedlist is : ");
        traversal(head);
    }
}

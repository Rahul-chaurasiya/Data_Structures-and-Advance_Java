
public class j34_kth_end_elememt {
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

    static void find_kth_end(Node head, int k) {
        if (head == null)
            return;
        Node curr;
        int len = 0;
        for (curr = head; curr != null; curr = curr.next)
            len++;

        if (len < k)
            return;

        curr = head;
        for (int i = 1; i < len - k + 1; i++)
            curr = curr.next;
        System.out.println(curr.data);
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
        System.out.print("Middle element is : ");
        find_kth_end(head, 5);
    }
}


======================================================================================


// Efficient solution
public class j34_kth_end_elememt {
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

    static void find_kth_end(Node head, int k) {
        if (head == null)
            return;
        Node first = head;
        Node second = head;
        for (int i = 0; i < k; i++) {
            if (first == null)
                return;
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
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
        System.out.print("Middle element is : ");
        find_kth_end(head, 5);
    }
}

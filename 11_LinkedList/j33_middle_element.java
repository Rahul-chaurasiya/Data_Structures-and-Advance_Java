
public class j33_middle_element {
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

    static void find_middle(Node head) {
        if (head == null)
            return;
        Node curr;
        int count = 0;
        for (curr = head; curr != null; curr = curr.next)
            count++;

        curr = head;
        for (int i = 0; i < count / 2; i++)
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
        find_middle(head);
    }
}


=======================================================================================


// Efficient solution
public class j33_middle_element {
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

    static void find_middle(Node head) {
        if (head == null)
            return;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
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
        find_middle(head);
    }
}

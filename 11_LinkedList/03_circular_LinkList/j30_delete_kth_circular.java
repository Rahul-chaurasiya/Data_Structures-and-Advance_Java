
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class j30_delete_kth_circular {

    public static void printlist(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }

    static Node deleteFirst(Node head) {

        if (head == null || head.next == head)
            return null;
        else {
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

    }

    static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }

        else {
            // insert node at 2nd position
            temp.next = head.next;
            head.next = temp;

            // data swap
            int t = temp.data;
            temp.data = head.data;
            head.data = t;

            return temp;
        }
    }

    static Node delete_kth(Node head, int k) {

        if (head == null)
            return null;
        if (k == 1)
            return deleteFirst(head);

        else {
            Node curr = head;
            for (int i = 0; i < k - 2; i++)
                curr = curr.next;

            curr.next = curr.next.next;
            return head;
        }

    }

    public static void main(String args[]) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head = insertEnd(head, 40);
        head = insertEnd(head, 50);
        head = insertEnd(head, 60);

        System.out.println("List before deletation ...");
        printlist(head);
        head = delete_kth(head, 4);

        System.out.println();
        System.out.println("List after deletation ...");
        printlist(head);

    }

}
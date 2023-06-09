
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class j28_insert_end_circular {

    public static void printlist(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }

    static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
            return head;
        }
    }

    public static void main(String args[]) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        System.out.println("List before insertion ...");
        printlist(head);
        head = insertEnd(head, 15);

        System.out.println();
        System.out.println("List after insertion ...");
        printlist(head);

    }

}



=====================================================================================



class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class j28_insert_end_circular {

    public static void printlist(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
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

    public static void main(String args[]) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        System.out.println("List before insertion ...");
        printlist(head);
        head = insertEnd(head, 15);

        System.out.println();
        System.out.println("List after insertion ...");
        printlist(head);

    }

}
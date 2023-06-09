

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class j29_delete_first_circular {

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
        if (head == null || head.next == head) return null;

        else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;
            curr.next = head.next;
            return curr.next;
        }
    }

    public static void main(String args[]) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        System.out.println("List before insertion ...");
        printlist(head);
        head = deleteFirst(head);

        System.out.println();
        System.out.println("List after deletation ...");
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

class j29_delete_first_circular {

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

        if (head == null || head.next == head) return null;
        else{
            head.data = head.next.data;
            head.next = head.next.next;
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
        head = deleteFirst(head);

        System.out.println();
        System.out.println("List after deletation ...");
        printlist(head);

    }

}
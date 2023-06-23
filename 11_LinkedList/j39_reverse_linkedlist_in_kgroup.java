
// If you want reverse last nodes which are less than k;
// 10 20 30 40 50 60 70 80
// 30 20 10 60 50 40 80 70 
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class j39_reverse_linkedlist_in_kgroup {

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);

        printlist(head);
        head = reverseK(head, 3);
        printlist(head);

    }

    static Node reverseK(Node head, int k) {
        Node curr = head, next = null, prev = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            Node rest_head = reverseK(next, k);
            head.next = rest_head;
        }
        return prev;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}


=========================================================================================================


// If you want reverse last nodes which are less than k;
// 10 20 30 40 50 60 70 80 
// 30 20 10 60 50 40 70 80 
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class j39_reverse_linkedlist_in_kgroup {

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        printlist(head);
        head = reverseKGroup(head, 3);
        printlist(head);

    }

    static Node reverseKGroup(Node head, int k) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        int size = 0;
        for (Node c = head; c != null; c = c.next) {
            size++;
        }

        if (size < k) {
            return head; // No need to reverse, return as it is
        }

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            head.next = reverseKGroup(next, k); // Reverse remaining sublist
        }

        return prev;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

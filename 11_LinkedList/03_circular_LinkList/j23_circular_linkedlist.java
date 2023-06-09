
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class j23_circular_linkedlist {

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = head;
        System.out.print(head.data + "-->" + head.next.data + "-->" + head.next.next.data + "-->" + head.next.next.next.data + "-->" + head.next.next.next.next.data + " = Head");

    }
}

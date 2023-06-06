

class j07_recursive_traversal {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static void print_rec(Node head) {
        if(head == null) return;
        System.out.print(head.data+" ");
        print_rec(head.next);
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        print_rec(head);

    } 

}

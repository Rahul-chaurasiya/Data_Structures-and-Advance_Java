
class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

class j15_doubly_linkedlist {

    static Node insert_begin(Node head,int x){
        Node temp = new Node(x);
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    public static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        System.out.print("our current Linkedlist is : ");
        traversal(head);
        head = insert_begin(head, 5);
        System.out.println("After insert at begenning");
        traversal(head);

    }

}

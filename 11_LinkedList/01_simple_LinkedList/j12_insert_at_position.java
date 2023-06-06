
public class j12_insert_at_position {
   
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node insert_at_position(Node head, int x,int pos) {
        Node temp = new Node(x);
        Node dup = head;
        for(int i=0;i<pos-1;i++){
            dup = dup.next;
        }

        temp.next = dup.next;
        dup.next = temp;

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

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.print("our current Linkedlist is : ");
        traversal(head);
        head = insert_at_position(head, 50,3);
        System.out.println("After insert at end");
        traversal(head);
    }
}

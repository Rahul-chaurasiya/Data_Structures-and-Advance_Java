
public class j38_remove_dulpicates {
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

    static void remove_dup(Node head) {
        Node curr = head;
        while(curr != null && curr.next != null){
            if(curr.data==curr.next.data){
                curr.next = curr.next.next;
            }
            else curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert_end(head, 20);
        head = insert_end(head, 30);
        head = insert_end(head, 40);
        head = insert_end(head, 40);
        head = insert_end(head, 40);
        head = insert_end(head, 50);
        head = insert_end(head, 50);
        head = insert_end(head, 60);
        head = insert_end(head, 70);

        System.out.print("our current Linkedlist is : ");
        traversal(head);

        System.out.print("After removing : ");
        remove_dup(head);
        traversal(head);
    }
}

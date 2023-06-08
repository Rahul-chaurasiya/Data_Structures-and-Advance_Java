
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

public class j20_delete_first_doubly {

    static Node insert_end(Node head, int x) {
        Node temp = new Node(x);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        temp.prev = curr;
        curr.next = temp;

        return head;
    }

    public static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node delete_first(Node head) {
        if (head == null) {
            System.out.println("List is empty...");
            return null;
        }

        if (head.next == null) {
            return null;
        }

        head = head.next;
        head.prev = null;
        return head;
    }

    public static void main(String args[]) {

        Node head = new Node(10);
        head = insert_end(head, 20);
        head = insert_end(head, 30);
        head = insert_end(head, 40);
        head = insert_end(head, 50);

        System.out.print("our current Linkedlist is : ");
        traversal(head);

        System.out.println("After deleting ... ");
        head = delete_first(head);
        traversal(head);

    }

}


=========================================================================================


public class j20_delete_first_doubly {
    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void delete_first() {
        if (tail == null) {
            return;
        } 

        head = head.next;
        head.prev = null;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        j20_delete_first_doubly list = new j20_delete_first_doubly();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original list:");
        list.display();

        list.delete_first();

        System.out.println("List after deleting element at the end:");
        list.display();
    }

}

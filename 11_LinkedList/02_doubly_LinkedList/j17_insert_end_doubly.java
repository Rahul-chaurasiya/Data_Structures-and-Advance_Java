
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

public class j17_insert_end_doubly{

    static void insert_end(Node head,int x){
        Node temp = new Node(x);
        while (head.next != null) {
            head = head.next;
        }
        temp.prev = head;
        head.next = temp;
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
        insert_end(head, 40);
        System.out.println("After insert at begenning");
        traversal(head);

    }

}



=================================================================================================================



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

public class j17_insert_end_doubly{

    static Node insert_end(Node head,int x){
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
        head = insert_end(head, 40);
        System.out.println("After insert at begenning");
        traversal(head);

    }

}


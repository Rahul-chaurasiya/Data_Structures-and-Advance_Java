
public class j08_insert_begenning {
   
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node insert_begenning(Node prev_head, int x) {
        Node head = new Node(x);
        head.next = prev_head;
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
        head = insert_begenning(head, 5);
        System.out.println("After insert at begenning");
        traversal(head);
    }
}



====================================================================================




class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class j08_insert_begenning {

    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String args[]) {
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        printlist(head);

    }
    
}



// Iterative way for searhcing...

public class j13_search {
    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    static void search(Node head, int x) {
        if (head == null)
            System.out.println("List is empty ...");
        else {
            Node curr = head;
            int pos = 1;
            while (curr != null) {
                if (curr.data == x) {
                    System.out.println("Element is found at : " + pos);
                    return;
                }
                pos++;
                curr = curr.next;
            }
            System.out.println("Element not found ... ");
        }
    }

    static void traversal(Node head) {
        if (head == null)
            System.out.println("List is empty ...");
        else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        System.out.print("Current List is : ");
        traversal(head);
        System.out.println();
        search(head, 6);
    }
}






// Recursive way for searhcing...

public class j13_search {
    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    static int search(Node head, int x) {
        if (head == null) return -1;
        if (head.data == x) return 1;
        else {
            int res = search(head.next, x);
            if(res == -1) return -1;
            else return res+1;
        }
    }

    static void traversal(Node head) {
        if (head == null)
            System.out.println("List is empty ...");
        else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        System.out.print("Current List is : ");
        traversal(head);
        System.out.println();
        System.out.println("Element is found at : "+ search(head, 6));
    }
}






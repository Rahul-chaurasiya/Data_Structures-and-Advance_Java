

// By modifying linkedlist structure
public class j40_detect_loop {
    static class Node {
        int data;
        Node next;
        boolean flag = false;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static boolean isLoop(Node head){
        Node curr = head;
        while(curr != null && curr.next != null){
            if(curr.flag == true)return true;
            curr.flag = true;
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
    	if (isLoop(head)) 
            System.out.print("Loop found"); 
        else
            System.out.print("No Loop"); 
    }
}


============================================================================================


// By modification to linkedlist refrences
public class j40_detect_loop {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static boolean isLoop(Node head) {
        Node curr = head;
        Node temp = new Node(0);
        while (curr != null && curr.next != null) {
            if (curr.next == temp)
                return true;
            Node x = curr.next;
            curr.next = temp;
            curr = x;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
        if (isLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }
}


============================================================================================


// By using a hashset
import java.util.HashSet;

public class j40_detect_loop {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static boolean isLoop(Node head) {
        Node curr = head;
        HashSet<Node> hs = new HashSet<Node>();
        while (curr != null && curr.next != null) {
            if (hs.contains(curr))
                return true;
            hs.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
        if (isLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }
}

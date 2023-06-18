
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class stack {
    Node head;
    int size = 0;

    stack() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (head == null)
            return Integer.MAX_VALUE;
        head = head.next;
        size--;
        return head.data;
    }

    int peek() {
        if (head == null)
            return Integer.MAX_VALUE;
        return head.data;
    }
}

public class j05_linkedlist_implementation {

    public static void main(String[] args) {
        stack s = new stack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}

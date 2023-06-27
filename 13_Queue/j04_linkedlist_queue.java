import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int key;
    Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int key) {

        Node temp = new Node(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue() {

        if (this.front == null)
            return;

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }
}

public class j04_linkedlist_queue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}

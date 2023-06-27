class Queue {
    int front;
    int rear;
    int size;
    int cap;
    int[] arr;

    Queue(int x) {
        size = 0;
        front = 0;
        cap = x;
        rear = cap - 1;
        arr = new int[cap];
    }

    boolean isempty() {
        return size == 0;
    }

    boolean isfull() {
        return size == cap;
    }

    void enqueue(int x) {
        if (isfull()) {
            System.out.println("Queue is full. Cannot enqueue item: " + x);
            return;
        }

        rear = (rear + 1) % cap;
        arr[rear] = x;
        size++;
    }

    int dequeue() {
        if (isempty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return Integer.MIN_VALUE;
        }

        int item = arr[front];
        front = (front + 1) % cap;
        size--;

        return item;
    }

    int Front() {
        if (isempty()) {
            System.out.println("Queue is empty.");
            return Integer.MIN_VALUE;
        }

        return arr[front];
    }

    int Rear() {
        if (isempty()) {
            System.out.println("Queue is empty.");
            return Integer.MIN_VALUE;
        }

        return arr[rear];
    }
}

public class j03_circular_array_queue {

    public static void main(String[] args) {
        Queue queue = new Queue(3);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Front item is " + queue.Front());
        System.out.println(queue.dequeue() + " dequeued from the queue\n");
        System.out.println("Front item is " + queue.Front());
        System.out.println("Rear item is " + queue.Rear());
    }
}


class Queue {
    private int rear;
    private int capacity;
    private int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        rear = -1;
        array = new int[this.capacity];
    }

    boolean isFull() {
        return (rear == capacity - 1);
    }

    boolean isEmpty() {
        return (rear == -1);
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue item: " + item);
            return;
        }

        rear++;
        array[rear] = item;
        System.out.println(item + " enqueued to the queue");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return Integer.MIN_VALUE;
        }

        int item = array[0];
        for (int i = 0; i < rear; i++) {
            array[i] = array[i + 1];
        }
        rear--;
        return item;
    }

    int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return Integer.MIN_VALUE;
        }

        return array[0];
    }

    int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return Integer.MIN_VALUE;
        }

        return array[rear];
    }
}

public class j02_array_queue {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Front item is " + queue.front());
        System.out.println(queue.dequeue() + " dequeued from the queue\n");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
    }
}

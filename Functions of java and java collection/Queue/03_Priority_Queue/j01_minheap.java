import java.util.*;
public class j01_minheap {

    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Above PriorityQueue is stored as following
        //   10
        //  /  \
        // 20  15

        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it from the PriorityQueue container
        System.out.println(pq.poll());

        // Post poll() PriorityQueue looks like
        //    15
        //   /
        //  20

        // Printing the top element again
        System.out.println(pq.peek());
    }
}

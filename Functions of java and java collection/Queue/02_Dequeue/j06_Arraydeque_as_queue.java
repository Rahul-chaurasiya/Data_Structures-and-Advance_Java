import java.util.*;;
public class j06_Arraydeque_as_queue {
    public static void main(String[] args) {
        // Creating empty ArrayDeque as Queue
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        // Add items to the ad using offer() at last
        ad.offer(10);
        ad.offer(20);

        System.out.println(ad.peek());// Returns the front of queue, 10
        System.out.println(ad.poll());// Returns and Removes the front of queue, 10
        System.out.println(ad.peek());// Returns the front of queue, 20

        ad.offer(40);// Adds 40 to last of queue

        System.out.println(ad.peek());// Returns the front of queue, 20
    }
}

import java.util.*;
public class j05_Arraydeque_as_dequeue {
    public static void main(String[] args) {
        // Creating empty ArrayDeque as Deque
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        // Add items to the ad
        ad.offerFirst(10);
        ad.offerLast(20);
        ad.offerFirst(30);
        ad.offerLast(40);

        System.out.println(ad.peekFirst());// Returns 30
        System.out.println(ad.peekLast());// Returns 40
        System.out.println(ad.pollFirst());// Returns and removes 30
        System.out.println(ad.peekFirst());// Returns 10
        System.out.println(ad.pollLast());// Returns and removes 40
        System.out.println(ad.peekLast());// Returns 20
    }
}

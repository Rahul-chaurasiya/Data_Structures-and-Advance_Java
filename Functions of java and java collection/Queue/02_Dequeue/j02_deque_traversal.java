import java.util.*;
public class j02_deque_traversal {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();

        // traversal at the first
        d.addFirst(10);// Adds element to front of queue
        d.addLast(20);// Adds element to end of queue
        d.addFirst(5);// Adds element to front of queue
        d.addLast(15);// Adds element to end of queue

        Iterator<Integer> it = d.iterator();// Traversal using Iterator
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        for (int x : d)// Traversal using for-each
            System.out.print(x + " ");
        System.out.println();

        // traversal at the end
        Iterator<Integer> it1 = d.descendingIterator();
        while (it1.hasNext())
            System.out.print(it1.next() + " ");
    }
}

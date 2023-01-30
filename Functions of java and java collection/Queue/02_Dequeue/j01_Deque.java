import java.util.*;
public class j01_Deque {

    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();

        // Functions that do not throw exception
        d.offerFirst(10);// Adds element to front of queue        
        d.offerLast(20);// Adds element to end of queue        
        d.offerFirst(5);// Adds element to front of queue        
        d.offerLast(15);// Adds element to end of queue

        System.out.println(d.peekFirst());// Retrieve the head element
        System.out.println(d.peekLast());// Retrieve the tail element

        d.pollFirst();// Retrieve and remove the head element
        d.pollLast();// Retrieve and remove the tail element

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());


        // Functions that can throw exception        
        d.addFirst(10);// Adds element to front of queue        
        d.addLast(20);// Adds element to end of queue        
        d.addFirst(5);// Adds element to front of queue        
        d.addLast(15);// Adds element to end of queue        
        
        System.out.println(d.getFirst());// Retrieve the head element        
        System.out.println(d.getLast());// Retrieve the tail element        
        
        d.removeFirst();// Retrieve and remove the head element        
        d.removeLast();// Retrieve and remove the tail element
        
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}

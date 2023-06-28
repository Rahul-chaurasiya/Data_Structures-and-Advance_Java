import java.util.ArrayDeque;
import java.util.Queue;

public class j05_queue_collection {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>(); 
        
        q.offer(10); 
        q.offer(20); 
        q.offer(30); 
        
        System.out.println(q.size()); 
        System.out.println(q.isEmpty()); 
        System.out.println(q); 


        Queue<Integer> q2 = new ArrayDeque<Integer>(); 
        
        q2.offer(10); 
        q2.offer(20); 
        q2.offer(30); 
        
        System.out.println(q2.peek()); 
        System.out.println(q2.poll()); 
        System.out.println(q2.peek()); 
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class j08_reversing_queue {

    static void print(Queue<Integer>queue){
        for(int x:queue){
            System.out.print(x+" ");
        }
    }

    public static void reverse(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.peek());
            q.remove();
        }

        while(!s.isEmpty()){
            q.add(s.peek());
            s.pop();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>(); 
		queue.add(12); 
		queue.add(5); 
		queue.add(15); 
		queue.add(20); 

		reverse(queue); 
		print(queue); 
    }
}


==================================================================================================================


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class j08_reversing_queue {

    static void print(Queue<Integer> queue) {
        for (int x : queue) {
            System.out.print(x + " ");
        }
    }

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty())
            return;
        int x = q.peek();
        q.remove();
        reverse(q);
        q.add(x);

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);

        reverse(queue);
        print(queue);
    }
}

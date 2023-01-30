import java.util.*;

public class j04_Arraydeque_as_stack {
    public static void main(String[] args) {
        // Creating empty ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        // Pushing items to the ad using add()
        ad.push(10);
        ad.push(20);

        System.out.println(ad.peek());// Returns the top of stack, 20        
        System.out.println(ad.pop());// Returns and Removes the top of stack, 20        
        System.out.println(ad.peek());// Returns the top of stack, 10
        
        ad.push(40);// Pushes 40

        System.out.println(ad.peek());// Returns the top of stack, 40
    }
}

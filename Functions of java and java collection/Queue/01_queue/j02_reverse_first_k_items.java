import java.util.*;
public class j02_reverse_first_k_items {
    static void reverseK(Queue<Integer> q, int k) {
        if (q.size() < 0 || k <= 0)
            return;
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }

        while (s.isEmpty() == false)
            q.offer(s.pop());

        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        int k = 3;
        reverseK(q, k);
        System.out.println(q);

    }
}

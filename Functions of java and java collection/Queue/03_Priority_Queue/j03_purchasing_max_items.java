import java.util.Arrays;
import java.util.*;
public class j03_purchasing_max_items {

    static int purchasemax(List<Integer> al, int sum) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(al);
        int res = 0;
        while (sum >= 0 && pq.isEmpty() == false && pq.peek() <= sum) {
            sum = sum - pq.poll();
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 12, 5, 111, 200 };
        List<Integer> al = Arrays.asList(arr);
        System.out.println(purchasemax(al, 10));
    }
}

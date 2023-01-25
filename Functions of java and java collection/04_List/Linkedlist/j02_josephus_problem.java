import java.util.*;

public class j02_josephus_problem {

    static int josephus(int n, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        while (list.size() > 1) {
            int count = 0;
            while (count < k) {
                while (it.hasNext() && count < k) {
                    it.next();
                    count++;
                }
                if (count < k) {
                    it = list.iterator();
                    it.next();
                    count++;
                }
            }
            it.remove();
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        int n = 7, k = 3;

        int ans = josephus(n, k);
        System.out.println(ans);
    }
}

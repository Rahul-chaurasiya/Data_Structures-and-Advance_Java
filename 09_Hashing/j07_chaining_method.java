import java.util.*;

class chaining {
    int bucket;
    ArrayList<LinkedList<Integer>> list;

    chaining(int b) {
        bucket = b;
        list = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            list.add(new LinkedList<Integer>());
        }
    }

    void insert(Integer x) {
        int i = x % bucket;
        list.get(i).add(x);
    }

    void delete(Integer x) {
        int i = x % bucket;
        list.get(i).remove(x);
    }

    boolean search(Integer x) {
        int i = x % bucket;
        return list.get(i).contains(x);
    }
}

public class j07_chaining_method {
    public static void main(String[] args) {
        chaining ch = new chaining(5);
        ch.insert(23);
        ch.insert(25);
        ch.insert(26);
        System.out.println(ch.search(23));
        ch.delete(25);
        System.out.println(ch.search(25));
    }
}

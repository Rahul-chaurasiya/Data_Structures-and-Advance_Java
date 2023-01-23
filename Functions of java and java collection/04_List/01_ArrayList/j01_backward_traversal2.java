import java.util.*;

public class j01_backward_traversal2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(24);
        list.add(25);

        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}

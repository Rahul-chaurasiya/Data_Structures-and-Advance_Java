import java.util.*;

public class j02_add_function {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            it.add(5);
            it.next();
        }

        System.out.println(list);
    }
}

import java.util.*;
public class j02_set_method {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(25);

        ListIterator <Integer> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            int x = it.previous();
            it.set(2*x);
        }
        System.out.println(list);
    }
}

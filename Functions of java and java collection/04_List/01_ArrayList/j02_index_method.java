import java.util.*;

class j02_index_method {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> it = list.listIterator(2);

        System.out.println(it.previousIndex());
        System.out.println(it.nextIndex());

    }

}
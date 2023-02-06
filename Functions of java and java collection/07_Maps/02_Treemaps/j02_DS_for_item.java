import java.util.*;
class MyDS {
    TreeMap<Integer, String> m;

    MyDS() {
        m = new TreeMap<Integer, String>();
    }

    void add(int price, String item) {
        m.put(price, item);
    }

    String find(int price) {
        String res = m.get(price);
        if (res == null)
            return "";
        else
            return res;
    }

    void printSorted() {
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }

    void printGreaterSorted(int price) {
        SortedMap<Integer, String> g = m.tailMap(price);
        for (Map.Entry<Integer, String> e : g.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }

    void printSmallerSorted(int price) {
        SortedMap<Integer, String> s = m.headMap(price);
        for (Map.Entry<Integer, String> e : s.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }
}

public class j02_DS_for_item {
    public static void main(String[] args) {
        MyDS t1 = new MyDS();
        t1.add(23, "tea");
        t1.add(13, "coffee");
        t1.add(27, "sugar");
        t1.add(33, "milk");

        System.out.println(t1.find(27));
        t1.printSorted();
        t1.printGreaterSorted(15);
        t1.printSmallerSorted(26);
    }
}

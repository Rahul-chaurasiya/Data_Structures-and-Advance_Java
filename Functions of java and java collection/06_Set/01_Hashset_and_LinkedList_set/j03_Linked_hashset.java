import java.util.*;
public class j03_Linked_hashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();

        s.add(10);
        s.add(20);
        s.add(30);

        for (Integer x : s)
            System.out.print(x + " ");

        s.remove(10);
        s.add(10);
        System.out.println(s);
    }
}

import java.util.*;
public class j01_treeset_method1 {
    public static void main(String[] args) {

        //These all methods is also in Hashset

        // Creating an empty TreeSet
        TreeSet<Integer> s = new TreeSet<Integer>();

        // Elements are added using add() method
        s.add(10);
        s.add(5);
        s.add(2);
        s.add(15);

        // Removing 5 from TreeSet
        s.remove(5);

        // foreach way of traversal
        for (Integer x : s)
            System.out.print(x + " ");
    }
}

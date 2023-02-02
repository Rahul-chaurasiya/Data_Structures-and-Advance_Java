import java.util.*;
public class j01_set_interface {

    public static void main(String[] args) {
        // Set demonstration using HashSet
        Set<Integer> s = new HashSet<Integer>();

        // Adding elements to the Set
        s.add(10);
        s.add(20);
        s.add(30);

        // Duplicate element is skipped
        s.add(20);
        System.out.println(s);
    }
}

import java.util.*;
public class j04_linkedhashmap3_access_order {
    public static void main(String[] args) {
        // Initialization of a LinkedHashMap with access order
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>(4, 0.6f, true);

        // Inserting the Elements
        m.put(10, "GfG");
        m.put(20, "IDE");
        m.put(15, "Courses");

        // Moves the key to end of the map
        System.out.println(m.get(10));

        // Displays the map
        System.out.println(m);

        // Modifies the existing value Also modifies the order of storage
        m.put(20, "Practice");

        // Displays the map
        System.out.println(m);
    }
}

import java.util.*;
public class j04_linkedhashmap2_operation {
    public static void main(String[] args) {
        // Initialization of a LinkedHashMap
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();

        // Inserting the Elements
        m.put(10, "GfG");
        m.put(20, "IDE");
        m.put(15, "Courses");

        // Removes <20, "IDE">
        m.remove(20);

        // Adding the pair at last
        m.put(20, "Practice");

        // Ordered output
        System.out.println(m);
    }
}

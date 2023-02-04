import java.util.*;
public class j04_linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();

        // Inserting the Elements
        m.put(10, "GfG");
        m.put(20, "IDE");
        m.put(15, "Courses");

        // Ordered output
        System.out.println(m);
    }
}

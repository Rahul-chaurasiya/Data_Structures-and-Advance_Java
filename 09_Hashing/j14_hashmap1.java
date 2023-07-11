
import java.util.HashMap;
import java.util.Map;

public class j14_hashmap1 {
    public static void main(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> m = new HashMap<>();

        // Add elements to the map
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        // Print size and content
        System.out.println(m);
        System.out.println(m.size());

        // Iterating over HashMap
        for (Map.Entry<String, Integer> e : m.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}

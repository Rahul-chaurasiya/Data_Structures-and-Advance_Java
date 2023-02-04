import java.util.*;
public class j01_map_interface {
    public static void main(String args[]) {
        // Creating instance of hashmap
        Map<Integer, String> m = new HashMap<>();

        // Addig values into the map
        m.put(100, "GfG");
        m.put(200, "Courses");
        m.put(150, "IDE");
        
        // Displaying the treemap
        System.out.println(m);

        // V get(Object key): This is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. 
        System.out.println(m.get(100));

        // boolean isEmpty(): It returns true if the map is empty else returns false.
        System.out.println(m.isEmpty());

        // V remove(Object key): This is used to remove the mapping for a key from this map if it is present in the map.
        System.out.println(m.remove(200));

        // boolean containsKey(Object key): This method is used to check whether a particular key is being mapped into the Map or not
        System.out.println(m.containsKey(200));

        // boolean containsValue(Object Value): This method is used to check whether a particular value is being mapped by a single or more than one key in the Map.
        System.out.println(m.containsValue("IDE"));

        // V replace(K key, V value): This used to replace the value of the specified key only if the key is previously mapped with some value.
        m.replace(150, "ID");
        System.out.println(m);

        // int size(): It returns the size of the given map which tells the number of key-value associations present in the map.
        System.out.println(m.size());

        // Set keySet(): This method is used to return a Set view of the keys contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
        System.out.println(m.keySet());

        // Collection values(): This is used to create a collection view out of the values present in the map. It basically returns a Collection view of the values in the HashMap
        System.out.println(m.values());

        // void clear(): This remove all the mappings making the size of map as 0.
        m.clear();
        System.out.println(m);
    }
}

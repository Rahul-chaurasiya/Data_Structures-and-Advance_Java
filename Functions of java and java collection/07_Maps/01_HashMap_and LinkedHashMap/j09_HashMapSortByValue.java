import java.util.*;
public class j09_HashMapSortByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 3);
        hashMap.put("orange", 2);
        hashMap.put("grape", 4);

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hashMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> sortedHashMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedHashMap);
    }
}



===========================================================================================



import java.util.*;
public class j09_HashMapSortByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);
        map.put("date", 5);
        map.put("elderberry", 15);
        map.put("fig", 20);

        int arr[] = new int[map.size()];
        int i = 0;
        for (int s : map.values()) {
            arr[i] = s;
            i++;
        }

        Arrays.sort(arr);

        for (int s : arr) {
            List<String> keys = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == s) {
                    keys.add(entry.getKey());
                }
            }
            System.out.println("Keys with value " + s + ": " + keys);
        }
    }
}

import java.util.*;
public class j07_print_order_frequency {

    static void printFrequencies(int arr[]) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int freq = m.get(arr[i]);
            if (freq != -1) {
                System.out.println(arr[i] + " " + freq);
                m.put(arr[i], -1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 10, 20 };
        printFrequencies(arr);
    }
}


===========================================================================


import java.util.*;
public class j07_print_order_frequency {

    static void printFrequencies(int arr[]) {
        // Linkedhashmap automatically maintain his order
        LinkedHashMap<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> x : m.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 10, 20, 5 };
        printFrequencies(arr);
    }
}

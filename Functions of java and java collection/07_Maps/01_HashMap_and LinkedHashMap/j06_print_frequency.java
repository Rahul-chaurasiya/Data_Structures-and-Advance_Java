import java.util.HashMap;
public class j06_print_frequency {
    static void printFrequencies(int arr[]) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i]) == false) {
                h.put(arr[i], 1);
            }

            else if (h.containsKey(arr[i]) == true) {
                int x = h.get(arr[i]);
                h.replace(arr[i], x, x + 1);
            }
        }
        for (HashMap.Entry<Integer, Integer> x : h.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 20, 5, 10, 5 };
        printFrequencies(arr);
    }
}


=====================================================================================


import java.util.*;
public class j06_print_frequency {
    static void printFrequencies(int arr[]) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> x : m.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 20, 5, 10, 5 };
        printFrequencies(arr);
    }
}

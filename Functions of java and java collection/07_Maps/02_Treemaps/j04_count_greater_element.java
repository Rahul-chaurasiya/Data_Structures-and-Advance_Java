import java.util.*;

class j04_count_greater_element {
    public static void printGreater(int arr[]) {
        
        int n = arr.length;
        TreeMap<Integer, Integer> mp = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        int cumFreq = 0;
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            Integer temp = e.getValue();
            mp.put(e.getKey(), cumFreq);
            cumFreq += temp;

        }
        for (int i = 0; i < n; i++)
            System.out.print(mp.get(arr[i]) + " ");
    }

    public static void main(String args[]) {
        int arr[] = { 2, 8, 10, 5, 8 };
        printGreater(arr);
    }
}

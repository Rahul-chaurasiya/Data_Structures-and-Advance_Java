import java.util.*;

public class j17_count_frequencies {

    static void countFreq(int arr[], int n) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int x : arr) {
            hs.put(x, hs.getOrDefault(x, 0) + 1);
        }

        // Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        // for (int i = 0; i < n; i++) {
        //     int key = arr[i];
        //     if (hmp.containsKey(arr[i]) == true)
        //         hmp.put(arr[i], hmp.get(arr[i]) + 1);
        //     else
        //         hmp.put(arr[i], 1);
        // }

        for (Map.Entry<Integer, Integer> itr : hs.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 15, 16, 27, 27, 28, 15 };
        int n = arr.length;

        countFreq(arr, n);
    }
}

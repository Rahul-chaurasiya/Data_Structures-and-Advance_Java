import java.util.*;

public class j04_binarysearch1 {
    public static void main(String[] args) {
        // Get the Arrays
        int arr[] = { 10, 20, 25, 40, 40 };

        // Find 20 inside arr
        System.out.println(Arrays.binarySearch(arr, 20));

        // Find 25 inside arr[0, 2]
        System.out.println(Arrays.binarySearch(arr, 0, 3, 25));

        // To convert to string
        System.out.println(Arrays.binarySearch(arr, 22));
    }
}

import java.util.*;

public class j05_equals2_subarray {
    public static void main(String[] args) {
        int[] a = { 0, 23, 10, 15, 20 };
        int[] b = { 10, 15, 20, 34, 5 };

        // Let us create different arrays of Integer wrapper class
        // Integer a[] = {10, 20, 30, 40, 60};
        // Integer b[] = {30, 40, 60, 5, 8};

        // Compares the arrays a and b
        if (Arrays.equals(a, 2, 5, b, 0, 3))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

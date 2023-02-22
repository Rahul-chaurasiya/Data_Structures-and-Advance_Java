import java.util.*;

public class j06_mismatch {
    public static void main(String[] args) {
        // Intializing the arrays
        int a[] = { 10, 20, 30 };
        int b[] = { 10, 20, 30 };
        int c[] = { 10, 20, 40, 30 };

        // Matching a and b
        System.out.println(Arrays.mismatch(a, b));

        // Matching a and c
        System.out.println(Arrays.mismatch(a, c));

        // Matching a and b subarrays
        System.out.println(Arrays.mismatch(a, 0, 2, c, 0, 2));

        // Intializing the arrays of non-primitive types
        String as[] = { "GeeksforGeeks", "IDE" };
        String bs[] = { "GeeksforGeeks", "Courses" };

        // Comparing using our own comparator where we have ignored the cases A method reference is passed
        System.out.println(Arrays.mismatch(as, bs, String::compareToIgnoreCase));

        // Matching a and b subarrays
        System.out.println(Arrays.mismatch(as, 0, 1, bs, 0, 1));
    }
}

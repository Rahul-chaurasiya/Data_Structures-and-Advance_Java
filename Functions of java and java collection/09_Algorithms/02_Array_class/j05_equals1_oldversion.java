
// Java program to demonstrate working of Arrays.equals() 
import java.util.Arrays;

public class j05_equals1_oldversion {
    public static void main(String[] args) {
        // Let us create different integers arrays
        int[] a = { 10, 15, 20 };
        int[] b = { 10, 15, 20 };
        int[] c = { 15, 10, 20 };

        // Compares the arrays a and b
        if (Arrays.equals(a, b))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Compares the arrays a and c
        if (Arrays.equals(a, c))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

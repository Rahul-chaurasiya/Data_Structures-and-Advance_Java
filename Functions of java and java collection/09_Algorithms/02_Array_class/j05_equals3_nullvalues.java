
// Java program to demonstrate working of Arrays.equals() 
import java.util.Arrays;

public class j05_equals3_nullvalues {
    public static void main(String[] args) {
        // Let us create different arrays of Integer wrapper class
        Integer a[] = { 10, 15, null, 30 };
        Integer b[] = { 10, 15, 30, null};

        // Compares the arrays a and b
        if (Arrays.equals(a, b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

import java.util.*;

public class j07_compare {
    public static void main(String[] args) {
        // Intializing the arrays
        // int a[] = {10, 20, 15};
        // int b[] = {10, 20, 30};

        // int a[] = {10, 20, 40};
        // int b[] = {10, 20, 30};

        // int a[] = {10, 20, 30, 40};
        // int b[] = {10, 20, 30};

        // int a[] = {10, 20, 15};
        // int b[] = {10, 200, 30};

        // Integer a[] = {10, 20, 30};
        // Integer b[] = {10, 20, 30};

        Integer a[] = { 10, 20, null, 15 };
        Integer b[] = { 10, 20, -30, 40 };

        // Comparing both the Arrays
        int res = Arrays.compare(a, b);

        // Checking them lexicographically
        if (res == 0)
            System.out.println("Same");
        else if (res > 0)
            System.out.println("a is greater");
        else
            System.out.println("a is smaller");



        System.out.println("=============================================================");



        Integer[] a2 = { 10, 20, 30, 40, 50 };
        Integer[] b2 = { 10, 20, 30, 35, 80 };

        int res2 = Arrays.compare(a2, 0, 3, b2, 0, 3);

        if (res2 == 0)
            System.out.println("Same");
        else if (res2 > 0)
            System.out.println("a is Greater");
        else
            System.out.println("a is Smaller");



        System.out.println("=============================================================");


        
        String a3[] = { "GfG", "IDE" };
        String b3[] = { "gfg", "ide" };

        // Comparing using our own comparator where we have ignored the cases
        if (Arrays.compare(a3, b3, String::compareToIgnoreCase) == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

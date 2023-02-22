import java.util.*;

public class j05_equals4_lamdaexpression {
    public static void main(String[] args) {
        // Intializing the arrays of non-primitive types
        String a[] = { "GFG", "IDE" };
        String b[] = { "Gfg", "ide" };

        // Comparing using our own comparator where we have ignored the cases A method reference is passed
        if (Arrays.equals(a, b, String::compareToIgnoreCase))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

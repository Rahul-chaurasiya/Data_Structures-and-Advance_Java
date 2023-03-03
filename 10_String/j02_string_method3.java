
public class j02_string_method3 {
    // Creating two string literals
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "for";

        int res = s1.compareTo(s2);

        if (res == 0)
            System.out.println("Same");

        if (res > 0)
            System.out.println("s1 is Greater");

        if (res < 0)
            System.out.println("s1 is Smaller");
    }
}

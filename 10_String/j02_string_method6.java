public class j02_string_method6 {
    public static void main(String args[]) {
        // Creating two string literals
        String s1 = "geeks";
        String s2 = "geeks";

        // Checking if both point to the same object or not
        if (s1 == s2)
            System.out.println("Yes");
        else
            System.out.println("No");

        // Creating a string using new operator
        String s3 = new String("geeks");

        // Checking if both point to the same object or not
        if (s1 == s3)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

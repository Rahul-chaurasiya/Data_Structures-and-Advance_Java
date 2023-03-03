public class j02_string_method7 {
    public static void main(String args[]) {
        // Creating two string literals
        String s1 = "geeks";
        String s2 = s1;

        // Creates a new object "geeksforgeeks" 
        // Now s1 points to this new string
        s1 = s1 + "forgeeks";
        // or
        // s1 = s1.concat("forgeeks");

        System.out.println(s1);

        // Since s2 is still pointing to initial "geeks" and s1 is pointing to a new object "geeksforgeeks"
        System.out.println(s1 == s2);
    }
}

public class j02_string_method2 {
    public static void main(String args[]) 
        {
            // Creating two string literals
            String s1 = "geeksforgeeks";
            String s2 = "geeks";
            
            System.out.println(s1.indexOf(s2));
            // Returns the first occurrence of s2 in s1 after index 1
            System.out.println(s1.indexOf(s2,1));
        } 
}

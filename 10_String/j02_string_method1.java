class j02_string_method1 {
    public static void main(String args[]) {
        // Creates a string literal
        String str = "geeks";

        // Returns the number of characters in the String.
        System.out.println(str.length());

        // Returns the character at ith index.
        System.out.println(str.charAt(3));

        // Return the substring from the ith index character to end of string
        System.out.println(str.substring(2));

        // Returns the substring from i to j-1 index.
        System.out.println(str.substring(2, 5));
    }
}

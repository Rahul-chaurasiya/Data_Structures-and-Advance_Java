public class j04_palindrome {
    public static void main(String[] args) {
        String s1 = "rahuluhar";
        StringBuilder s2 = new StringBuilder(s1);
        s2.reverse();
        if (s1.equals(s2.toString()))
            System.out.println("String is palindrome");
        else
            System.out.println("Not palindrome");
    }
}


=========================================================================

// Efficient solution
public class j04_palindrome {
    static boolean palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(palindrome(str));
    }

}

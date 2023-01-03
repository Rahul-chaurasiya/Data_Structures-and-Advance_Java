public class j10_palindrome_check {

    static boolean ispalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end) && ispalindrome(str, start + 1, end - 1));
    }

    public static void main(String[] args) {
        String str = "abbcbba";
        System.out.println(ispalindrome(str, 0, 6));
    }
}

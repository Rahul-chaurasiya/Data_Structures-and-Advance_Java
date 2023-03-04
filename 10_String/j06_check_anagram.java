import java.util.Arrays;
public class j06_check_anagram {

    static boolean areAnagram(String str1, String str2) {
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        str1 = new String(a);
        str2 = new String(b);
        return (str1.equals(str2));
    }

    public static void main(String[] args) {
        String str1 = "abaac";
        String str2 = "aacba";
        if (areAnagram(str1, str2))
            System.out.println("The two strings are" + " anagram of each other");
        else
            System.out.println("The two strings are not" + " anagram of each other");
    }
}


==================================================================================================

// Efficient solution
public class j06_check_anagram {
    static boolean areAnagram(String str1, String str2) {
        int arr[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
            arr[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abaac";
        String str2 = "aacba";
        if (areAnagram(str1, str2))
            System.out.println("The two strings are" + " anagram of each other");
        else
            System.out.println("The two strings are not" + " anagram of each other");
    }
}

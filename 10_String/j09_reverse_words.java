public class j09_reverse_words {

    static void reverse(char str[], int low, int high) {
        while (low <= high) {
            char ch = str[low];
            str[low] = str[high];
            str[high] = ch;
            low++;
            high--;
        }
    }

    static void reverseWords(char str[], int n) {
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == ' ') {
                reverse(str, start, i-1);
                start = i + 1;
            }
        }
        reverse(str, start , n - 1);
        reverse(str, 0, n - 1);
    }

    public static void main(String[] args) {
        String s = "My name is rahul chaurasiya";
        int n = s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing words in the string:");

        reverseWords(str, n);
        System.out.println(str);
    }
}


=====================================================================================

// Without using any inbuilt function
public class j09_reverse_words {
    static void reverseWords(String str, int length) {
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                for (int j = i + 1; j < length; j++) {
                    if (str.charAt(j) == ' ')
                        break;
                    System.out.print(str.charAt(j));
                }
                System.out.print(" ");
            }
            if (i == 0) {
                for (int j = i; j < length; j++) {
                    if (str.charAt(j) == ' ')
                        break;
                    System.out.print(str.charAt(j));
                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "My name is rahul chaurasiya";
        int n = str.length();

        reverseWords(str, n);
    }
}

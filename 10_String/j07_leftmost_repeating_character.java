public class j07_leftmost_repeating_character {
    static int leftMost(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String str = "absdasb";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }
}


===========================================================================================


public class j07_leftmost_repeating_character {

    static int leftMost(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)-'a'] > 1)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        String str = "absdasb";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }
}


=============================================================================================
  

public class j07_leftmost_repeating_character {
    static int leftMost(String str) {
        boolean isvisited[] = new boolean[26];
        int res = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (isvisited[str.charAt(i) - 'a']) res = i;
            else isvisited[str.charAt(i) - 'a'] = true;
        }
        return res;
    }

    public static void main(String args[]) {
        String str = "absdasb";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }
}


=============================================================================================


import java.util.*;
public class j07_leftmost_repeating_character {

    static int leftMost(String str) {
        int[] fIndex = new int[26];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int fi = fIndex[str.charAt(i)-'a'];
            if (fi == -1)
                fIndex[str.charAt(i)-'a'] = i;
            else
                res = Math.min(res, fi);
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    public static void main(String args[]) {
        String str = "absdasb";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }
}

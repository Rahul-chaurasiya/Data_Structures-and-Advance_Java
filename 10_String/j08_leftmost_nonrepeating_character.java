public class j08_leftmost_nonrepeating_character {
    static int nonRep(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        String str = "abaccas";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }
}


=============================================================================================


public class j08_leftmost_nonrepeating_character {
    static int nonRep(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        String str = "abaccas";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }
}


===============================================================================================


import java.util.*;
public class j08_leftmost_nonrepeating_character {
    static int nonRep(String str) {
        int[] fI = new int[26];
        Arrays.fill(fI, -1);

        for (int i = 0; i < str.length(); i++) {
            if (fI[str.charAt(i)-'a'] == -1)
                fI[str.charAt(i)-'a'] = i;
            else
                fI[str.charAt(i)-'a'] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < fI.length; i++) {
            if (fI[i] >= 0)
                res = Math.min(res, fI[i]);
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    public static void main(String args[]) {
        String str = "abaccas";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }
}

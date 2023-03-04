import java.util.*;
public class j05_check_subsequence {
    static boolean isSubSeq(String s1, String s2) {
        for (int i = 0, j = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) j++;
            if (j == s2.length()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();

        System.out.println(isSubSeq(s1, s2));
        sc.close();
    }
}


============================================================================================

// Efficient solution
import java.util.*;
public class j05_check_subsequence {
    static boolean isSubSeq(String s1, String s2,int n ,int m) {
        if( m == 0 ) return true;
        if( n == 0 ) return false;
            
        if ( s1.charAt(n-1) == s2.charAt(m-1) ) return isSubSeq(s1, s2, n-1, m-1);
        else return isSubSeq(s1, s2, n-1, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();

        System.out.println(isSubSeq(s1, s2,s1.length(),s2.length()));
        sc.close();
    }
}

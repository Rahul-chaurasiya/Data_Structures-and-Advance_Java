public class j11_pattern_searching {
    static void patSearchinng(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
                if (j == m - 1)
                    System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        String txt = "ABCABCD";
        String pat = "AB";
        System.out.print("All index numbers where pattern found: ");
        patSearchinng(txt, pat);
    }
}

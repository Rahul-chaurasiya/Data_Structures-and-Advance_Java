public class j00_stringbuilder {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(ch == '*')res.setLength(res.length()-1);
            else res.append(ch);
        }
        System.out.println(res);
    }
}

public class j13_generate_subsets {

    static void printSub(String str, String curr, int index) {
        if (index == str.length()) {
            System.out.print(curr + " ");
            return;
        }

        printSub(str, curr, index + 1);
        printSub(str, curr + str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        printSub(s, "", 0);
    }
}

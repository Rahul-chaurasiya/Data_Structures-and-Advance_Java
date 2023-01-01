public class j05_print_n_to_1 {
    static void printTo1(int n) {
        if (n == 0)
            return;

            System.out.print(n + " ");
            printTo1(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        printTo1(n);
    }
}

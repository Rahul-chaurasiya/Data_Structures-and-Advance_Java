public class j15_josephus_problem {

    static int jos(int n, int k) {
        if (n == 1)
            return 0;
        else
            return ((jos(n - 1, k) + k) % n);
    }

    static int myJos(int n, int k) {
        return jos(n, k) + 1;
    }

    public static void main(String[] args) {
        System.out.println(myJos(5, 3));
    }
}
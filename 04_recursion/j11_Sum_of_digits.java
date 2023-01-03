public class j11_Sum_of_digits {

    static int digitsum(int n) {
        if (n <= 0) return n;

        return ((n % 10) + digitsum(n / 10));
    }

    public static void main(String[] args) {
        int n = 4353;
        System.out.println(digitsum(n));
    }
}

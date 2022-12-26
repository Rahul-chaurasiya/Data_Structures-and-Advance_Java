public class j13_iterative_power {

    static int power(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0)             // n & 1
                res = res * x;                       
            x = x * x;
            n = n / 2;                  // n = n >> 1
        }
        return res;
    }

    public static void main(String[] args) {

        int x = 3, n = 5;
        System.out.println(power(x, n));
    }
}

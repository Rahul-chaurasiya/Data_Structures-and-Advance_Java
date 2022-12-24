public class j07_LCM {

    static int lcm(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (a % res == 0 && b % res == 0)
                return res;
            res++;
        }
        return res;
    }
  
    public static void main(String[] args) {

        int a = 4, b = 6;
        System.out.println(lcm(a, b));

    }
}


======================================================
  
  
// efficient solution

public class j07_LCM {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        int a = 4, b = 6;
        System.out.println(lcm(a, b));

    }
}

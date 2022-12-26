public class j09_Prime_Factors {

    static void printPrimeFactors(int n) {
        for(int i=2;i<n/2;i++){
            if(isprime(i)){
                int x = i;
                while(n%x == 0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }

    static boolean isprime(int x) {
        if (x == 0 || x == 1)
            return false;
        if (x == 2 || x == 3)
            return true;
        if (x % 2 == 0 || x % 3 == 0)
            return false;
        for (int i = 5; i < x; i = i * 5) {
            if (x % i == 0 || x % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 450;
        printPrimeFactors(n);

    }
}


=============================================================
  
// efficient solution
  
public class j09_Prime_Factors {

    static void printPrimeFactors(int n) {
        if (n <= 1)
            return;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if (n > 1)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 450;
        printPrimeFactors(n);

    }
}


============================================================
  
// efficient solution 
  
public class j09_Prime_Factors {

    static void printPrimeFactors(int n) {
        if (n <= 1)
            return;

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n = n / 3;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                n = n / (i + 2);
            }
        }
        if (n > 3)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 450;
        printPrimeFactors(n);

    }
}



public class j05_trailing_zeros_in_factorial {

    static int fact(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    static int countTrailingZeros(int n){
        int ans=0;
        long fact = fact(n); 
        while(fact%10==0){
            ans++;
            fact=fact/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int number = 251;
        System.out.println(countTrailingZeros(number));
    }
}


==================================================================
  
// efficient solution
  
  
public class j05_trailing_zeros_in_factorial {

    static int countTrailingZeros(int n){
        int ans = 0;
        for (int i = 5; i < n; i=i*5) {
            ans = ans+n/i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int number = 251;
        System.out.println(countTrailingZeros(number));
    }
}

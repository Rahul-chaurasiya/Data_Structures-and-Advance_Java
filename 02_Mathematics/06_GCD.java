public class j06_GCD {

    static int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    public static void main (String[] args) {
		
		int a = 10, b = 20;
		System.out.println(gcd(a, b));

	}
}


=======================================================
  

// efficeint solution
  
public class j06_GCD {

    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

    public static void main (String[] args) {
		
		int a = 10, b = 20;
		System.out.println(gcd(a, b));

	}
}

========================================================
  
// Recurssive solution
  
public class j06_GCD {

    static int gcd(int a, int b)
	  {
		if(b==0)
			return a;

		return gcd(b, a % b);
	  }

    public static void main (String[] args) {
		
		int a = 10, b = 20;
		System.out.println(gcd(a, b));

	}
}

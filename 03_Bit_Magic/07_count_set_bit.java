public class j07_count_set_bit {

    static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 != 0) // (n & 1 == 1) res++;    // res = res + (n & 1)
                count++;
            n = n / 2;      // n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        int i = 9;
        System.out.println(countSetBits(i));
    }
}

===============================================================================
  

public class j07_count_set_bit {

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        int i = 9;
        System.out.println(countSetBits(i));
    }
}


================================================================================
  
// efficient solution
  
public class j07_count_set_bit {

    static int[] table = new int[256];
    public static void initialize() {
        table[0] = 0;
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    public static int countSetBits(int n) {
        return table[n & 0xff] +
                table[(n >> 8) & 0xff] +
                table[(n >> 16) & 0xff] +
                table[n >> 24];
    }
    public static void main(String[] args) {
        initialize();
        int n = 9;
        System.out.println(countSetBits(n));
    }
}


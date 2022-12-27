
public class j06_Check_Kth_bit_is_set_or_not {
    
    public static void isKthBitSet(int n, int k) {
        if ((n & (1 << (k - 1))) == 1)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }

    public static void main(String[] args) {
        int n = 5, k = 1;
        isKthBitSet(n, k);
    }
}

======================================================
  
public class j06_Check_Kth_bit_is_set_or_not {
    public static void isKthBitSet(int n, int k) {
        if (((n >> (k - 1)) & 1) == 1)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }

    public static void main(String[] args) {
        int n = 5, k = 1;
        isKthBitSet(n, k);
    }
}

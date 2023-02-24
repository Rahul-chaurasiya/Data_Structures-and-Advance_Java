public class j08_square_root {
    static int sqRoot(int x) {
        int i = 1;

        while (i * i <= x)
            i++;

        return i - 1;
    }

    public static void main(String[] args) {
        int x = 15;
        System.out.println(sqRoot(x));
    }
}


===============================================================
    
// Efficient solution
public class j08_square_root {
    static int sqRoot(int x) {
        int low = 1, high = x, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mSq = mid * mid;

            if (mSq == x) return mid;
            else if (mSq > x) high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 15;
        System.out.println(sqRoot(x));
    }
}

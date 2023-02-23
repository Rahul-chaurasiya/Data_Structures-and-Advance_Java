public class j02_Binarysearch_recursive {

    static int bSearch(int arr[], int n, int x) {
        if (arr[n] == x) return n;
        else if (n == 0) return -1;
        else return bSearch(arr, n - 1, x);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 }, n = 6;
        int x = 10;

        System.out.println(bSearch(arr, n-1, x));
    }
}


=====================================================================================
    
// Efficient solution
public class j02_Binarysearch_recursive {

    static int bSearch(int arr[], int low, int high, int x) {
        if (low > high) return -1;

        int mid = (high + low) / 2;

        if (arr[mid] == x) return mid;
        else if (arr[mid] > x) return bSearch(arr, low, mid - 1,  x);
        else return bSearch(arr, mid + 1, high, x);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int x = 10, low = 0, high = arr.length;

        System.out.println(bSearch(arr, low, high, x));
    }
}

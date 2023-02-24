public class j09_search_in_infinite_size_array {
    static int search(int arr[], int x) {
        int mid = 1;
        if (arr[0] == x)
            return 0;
        while (arr[mid] < x) {
            mid = mid * 2;
        }
        return bSearch(arr, x, mid);
    }

    
    static int bSearch(int arr[], int x, int n) {
        int high = n;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                low = mid + 1;
            else if (arr[mid] > x)
                high = mid - 1;
        }
        return -1;
    }

    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 40, 50 };
        int x = 3;

        System.out.println(search(arr, x));
    }
}

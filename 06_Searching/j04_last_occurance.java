// Recursive solution
public class j04_last_occurance {

    static int lastOcc(int arr[], int low, int high, int x, int n) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (x > arr[mid]) return lastOcc(arr, mid + 1, high, x, n);
        else if (x < arr[mid]) return lastOcc(arr, low, mid - 1, x, n);

        else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid]) return mid;
            else return lastOcc(arr, mid + 1, high, x, n);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 10, 10, 10, 10, 20, 20 }, n = 7;
        int x = 10;

        System.out.println(lastOcc(arr, 0, n - 1, x, n));
    }
}


=====================================================================================


// Iterative solution
public class j04_last_occurance {

    static int lastOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x > arr[mid]) low = mid + 1;
            else if (x < arr[mid]) high = mid - 1;
            else {
                if (mid == n || arr[mid + 1] != arr[mid]) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 10, 10, 20 };
        int x = 10;

        System.out.println(lastOcc(arr, arr.length - 1, x));
    }
}

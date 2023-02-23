public class j01_Binarysearch_iterative {

    static int bSearch(int arr[], int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int x = 20;

        System.out.println(bSearch(arr, x));
    }
}


========================================================================================

// efficient solution
public class j01_Binarysearch_iterative {

    static int bSearch(int arr[], int x) {

        int high = arr.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] < x) low = mid + 1;
            else if (arr[mid] > x) high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int x = 20;

        System.out.println(bSearch(arr, x));
    }
}

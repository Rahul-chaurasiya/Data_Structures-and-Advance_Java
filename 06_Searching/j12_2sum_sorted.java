public class j12_2sum_sorted {
    static boolean findnum(int arr[], int x) {
        int high = arr.length - 1;
        int low = 0;
        while (low < high) {
            if (arr[low] + arr[high] == x)
                return true;
            if (arr[low] + arr[high] > x)
                high = high - 1;
            else
                low = low + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 12, 30 };
        System.out.println(findnum(arr, 17));
    }
}

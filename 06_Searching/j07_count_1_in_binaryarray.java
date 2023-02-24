public class j07_count_1_in_binaryarray {
    static int count1(int arr[], int n) {
        int low = 0;
        int high = n;
        if(arr[n-1] == 0) return -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0) low = mid + 1;
            else {
                if (mid == 0 || arr[mid - 1] == 0) return n-mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1 };
        System.out.println(count1(arr, arr.length));
    }
}

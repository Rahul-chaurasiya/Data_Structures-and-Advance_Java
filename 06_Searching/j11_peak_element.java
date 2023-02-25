public class j11_peak_element {
    static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] < arr[mid]))
                return mid;
            if (mid > 0 && arr[mid - 1] > arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 20, 40, 30, 20, 50, 60 };
        System.out.println(findPeakElement(arr));
    }
}

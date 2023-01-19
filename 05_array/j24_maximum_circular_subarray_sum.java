public class j24_maximum_circular_subarray_sum {
    static int nrmlmaxsum(int arr[], int n) {
        int res = arr[0];
        int maxend = arr[0];
        for (int i = 1; i < n; i++) {
            maxend = Math.max(maxend + arr[i], arr[i]);
            res = Math.max(maxend, res);
        }
        return res;
    }

    static int circularmaxsum(int arr[], int n) {
        int max_nrml = nrmlmaxsum(arr, n);

        if (max_nrml < 0)
            return max_nrml;

        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }

        int max_circular = arr_sum + nrmlmaxsum(arr, n);
        return Math.max(max_nrml, max_circular);
    }

    public static void main(String[] args) {
        int arr[] = { 8, -4, 3, -5, 4 };
        int n = 5;
        System.out.println(circularmaxsum(arr, n));
    }
}

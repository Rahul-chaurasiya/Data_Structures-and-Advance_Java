

public class j23_longest_even_odd_subarray {

    static int subarry(int arr[], int n) {
        int res = 0, count = 1;
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] % 2 != 0 && arr[i + 1] % 2 == 0) || (arr[i] % 2 == 0 && arr[i + 1] % 2 != 0)) {
                count++;
                res = Math.max(count, res);
            }

            else
                count = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 10, 20, 6, 3, 8 }, n = 6;
        // int arr[] = { 1, 5, 3, 8, 12 }, n = 5;
        int arr[] = { 5, 2, 3, 2, 3 }, n = 5;
        System.out.println(subarry(arr, n));
    }
}

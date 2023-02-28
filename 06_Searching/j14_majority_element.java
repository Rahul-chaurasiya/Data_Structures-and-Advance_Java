public class j14_majority_element {

    static int findMajority(int arr[], int n) {
        int res = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i])
                count++;
            else if (arr[res] == arr[i])
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[res])
                count++;
        }
        if (count <= n / 2)
            return -1;
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 }, n = 8;
        System.out.println(findMajority(arr, n));
    }
}

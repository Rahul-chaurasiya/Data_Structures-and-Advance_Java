public class j25_majority_element {

    static int findMajority(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count > n / 2)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 }, n = 8;
        System.out.println(findMajority(arr, n));
    }
}


=========================================================================


// efficient solution
public class j25_majority_element {

    static int findMajority(int arr[], int n) {
        int count = 1, res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[res]) count++;
            else if (arr[i] != arr[res]) count--;
            if (count == 0) {
                count = 1;
                res = i;
            }
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[res]) count++;
        }

        if (count <= n / 2) return -1;

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 }, n = 8;
        System.out.println(findMajority(arr, n));
    }
}

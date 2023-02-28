import java.util.Arrays;
class j15_repeating_element1 {
    static int repeat(int arr[], int n) {
        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if(arr[i] == arr[i-1]) return arr[i];
        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 0, 2, 1, 3, 2, 2 }, n = 6;
        System.out.println(repeat(arr, n));
    }
}


======================================================================
  

// efficient solution
class j15_repeating_element1 {
    static int repeat(int arr[], int n) {
        boolean visit[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visit[arr[i]])
                return arr[i];
            visit[arr[i]] = true;
        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 0, 2, 1, 3, 2, 2 }, n = 6;
        System.out.println(repeat(arr, n));
    }
}

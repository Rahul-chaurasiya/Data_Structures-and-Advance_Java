public class j20_trapping_rain_water {

    static int getWater(int arr[], int n) {
        int res = 0;

        for (int i = 1; i < n - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++)
                lMax = Math.max(lMax, arr[j]);

            int rMax = arr[i];
            for (int j = i + 1; j < n; j++)
                rMax = Math.max(rMax, arr[j]);

            res = res + (Math.min(lMax, rMax) - arr[i]);
        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 0, 1, 2, 5 }, n = 5;
        System.out.println(getWater(arr, n));
    }
}


==========================================================================

efficient solution

public class j20_trapping_rain_water {

    static int getWater(int arr[], int n) {
        int res = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];

        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }

        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }
        return res;
    }

    public static void main(String args[]) {
        // int arr[] = { 3, 0, 1, 2, 5 }, n = 5;
        int arr[] = { 5, 0, 6, 2, 3 }, n = 5;
        System.out.println(getWater(arr, n));
    }
}

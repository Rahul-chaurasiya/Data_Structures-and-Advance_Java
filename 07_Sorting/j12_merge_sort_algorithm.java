public class j12_merge_sort_algorithm {
    static int[] merge(int a[], int l, int m, int h) {
        int n1 = m - l + 1, n2 = h - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) left[i] = a[i + l];
        for (int j = 0; j < n2; j++) right[j] = a[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) a[k++] = left[i++];
            else a[k++] = right[j++];
        }
        
        while (i < n1) a[k++] = left[i++];
        while (j < n2) a[k++] = right[j++];
        return a;
    }

    static void mergeSort(int arr[], int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int a[] = new int[] { 10, 5, 30, 15, 7 };
        int l = 0, r = 4;

        mergeSort(a, l, r);
        for (int x : a)
            System.out.print(x + " ");
    }
}

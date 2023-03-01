public class j11_merge_function {
    static int[] merge(int a[], int l, int m, int h) {
        int left[] = new int[m + 1];
        int right[] = new int[h - m];
        
        for (int i = 0; i < left.length; i++) left[i] = a[i];
        for (int i = 0; i < right.length; i++) right[i] = a[i + m + 1];

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) a[k++] = left[i++];
            else a[k++] = right[j++];
        }

        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
        return a;
    }

    public static void main(String[] args) {
        int a[] = new int[] { 10, 15, 20, 40, 8, 11, 15, 22, 25 };
        int l = 0, h = 8, m = 3;

        merge(a, l, m, h);
        for (int x : a)
            System.out.print(x + " ");

    }
}

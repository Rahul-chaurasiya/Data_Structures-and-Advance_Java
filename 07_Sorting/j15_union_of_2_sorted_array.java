public class j15_union_of_2_sorted_array {
    static void union(int a[], int b[]) {
        int i = 0, j = 0;
        int m = a.length;
        int n = b.length;
        while (i < m && j < n) {
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            if (j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while (i < m) {
            if (i == 0 || a[i] != a[i - 1])
                System.out.print(a[i] + " ");
            i++;
        }
        while (j < n) {
            if (j == 0 || b[j] != b[j - 1])
                System.out.print(b[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
        int arr2[] = { 5, 10, 10, 15, 30 };
        union(arr1, arr2);
    }
}

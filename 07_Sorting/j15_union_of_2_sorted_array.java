public class j15_union_of_2_sorted_array {
    static void union(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if ((i > 0 && arr1[i] == arr1[i - 1])) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            if (arr1[i] > arr2[j]) {
                System.out.println(arr1[j] + " ");
                j++;
            } else if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i] + " ");
                i++;
            } else if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            if ((i > 0 && arr1[i] != arr1[i - 1]))
                System.out.println(arr1[i++] + " ");
        }
        while (j < arr2.length) {
            if (j > 0 && arr2[j] != arr2[j - 1])
                System.out.println(arr2[j++] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
        int arr2[] = { 5, 10, 10, 15, 30 };
        union(arr1, arr2);
    }
}

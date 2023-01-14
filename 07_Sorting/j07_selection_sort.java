
public class j07_selection_sort {

    static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int x = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[x]) {
                    x = j;
                }
            }
            int temp = arr[x];
            arr[x] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 8, 20, 5, 7, 1 };
        selectionsort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}


public class j12_move_zeros_to_end {

    static void movezero(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        // swap(arr[i],arr[j]);
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 5, 0, 0, 8, 0, 9 }, n = 7;

        System.out.println("Before Removal");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("After Removal");
        movezero(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

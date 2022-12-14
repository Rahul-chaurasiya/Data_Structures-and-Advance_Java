

public class j14_left_rotate_array_by_d {

    static void lRotateOne(int arr[], int n) {
        int value = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = value;
    }

    static void dRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            lRotateOne(arr, n);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }, n = 7, d = 2;

        System.out.println("Before Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        dRotate(arr, d,n);

        System.out.println("After Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}


========================================================================
  
  
public class j14_left_rotate_array_by_d {

    static void dRotate(int arr[], int d, int n) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d, j = 0; i < n; i++, j++) {
            arr[j] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }, n = 7, d = 2;

        System.out.println("Before Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        dRotate(arr, d,n);

        System.out.println("After Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}



==========================================================================
    
    
public class j14_left_rotate_array_by_d {

    static void dRotate(int arr[], int d, int n) {
        rotate(arr, 0, d - 1);
        rotate(arr, d, n - 1);
        rotate(arr, 0, n - 1);
    }

    static void rotate(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }, n = 7, d = 2;

        System.out.println("Before Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        dRotate(arr, d,n);

        System.out.println("After Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}





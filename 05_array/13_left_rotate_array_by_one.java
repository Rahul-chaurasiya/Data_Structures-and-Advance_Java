

public class j13_left_rotate_array_by_one {

static void lRotateOne(int arr[],int n){
    int value = arr[0];
    for(int i=0;i<n-1;i++){
        arr[i] = arr[i+1];
    }
    arr[n-1] = value;
}


    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 }, n = 5;

        System.out.println("Before Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        lRotateOne(arr, n);

        System.out.println("After Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

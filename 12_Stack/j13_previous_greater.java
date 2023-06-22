public class j13_previous_greater {

    public static void printPrevGreater(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == -1)
                System.out.print(-1 + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 20, 30, 10, 5, 15 };
        printPrevGreater(arr, arr.length);

    }
}


========================================================================================================



import java.util.Stack;
public class j13_previous_greater {

    public static void printPrevGreater(int arr[], int n) {

        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            int prevmax = s.isEmpty() ? -1 : s.peek();
            System.out.print(prevmax + " ");
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 20, 30, 1, 15, 5 };
        printPrevGreater(arr, arr.length);

    }
}

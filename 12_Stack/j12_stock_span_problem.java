public class j12_stock_span_problem {

    static void stock_span(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0 && arr[i] >= arr[j]; j--) {
                count++;
            }
            System.out.print(count + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {18,12,13,14,11,16};
        stock_span(arr);
    }
}



========================================================================================================



import java.util.Stack;
public class j12_stock_span_problem {

    public static void printSpan(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        s.add(0);
        System.out.print(1 + " ");
        for (int i = 1; i < n; i++) {
            while (s.isEmpty() == false && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 18, 12, 13, 14, 11, 16 };

        printSpan(arr, arr.length);

    }
}

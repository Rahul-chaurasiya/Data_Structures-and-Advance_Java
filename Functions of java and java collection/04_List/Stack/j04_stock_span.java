public class j04_stock_span {
    static void printSpan(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int j = i - 1;
            while (j >= 0 && arr[j] <= arr[i]) {
                count++;
                j--;
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 60, 10, 20, 40, 35, 30, 50, 70, 65 };
        printSpan(arr);
    }
}

====================================================================

import java.util.*;
public class j04_stock_span {
    static void printSpan(int arr[]) {

        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0);
        int span = 1;

        System.out.print(span + " ");

        for (int i = 1; i < arr.length; i++) {
            while (stack.isEmpty() == false && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            span = (stack.isEmpty()) ? i + 1 : (i - stack.peek());
            System.out.print(span + " ");

            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 60, 10, 20, 40, 35, 30, 50, 70, 65 };
        printSpan(arr);
    }
}

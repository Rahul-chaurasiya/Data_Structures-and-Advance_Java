public class j05_previous_greater_element {
    static void prevGreater(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int ans=-1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    ans = arr[j];
                    break;
                }
            }
            System.out.print(ans+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 10, 5, 15 };
        prevGreater(arr);
    }
}



=======================================================================



import java.util.*;

public class j05_previous_greater_element {
    static void prevGreater(int arr[]) {
        Deque<Integer> stack = new ArrayDeque<Integer>();

        stack.push(arr[0]);
        int pg = -1;

        System.out.print(pg + " ");

        for (int i = 1; i < arr.length; i++) {
            while (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                stack.pop();
            }

            pg = (stack.isEmpty()) ? -1 : stack.peek();
            System.out.print(pg + " ");

            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 10, 5, 15 };
        prevGreater(arr);
    }
}

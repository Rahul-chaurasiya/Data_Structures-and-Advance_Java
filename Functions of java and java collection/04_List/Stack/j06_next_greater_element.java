public class j06_next_greater_element {

    static void nextGreater(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int ans = -1;
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    ans = arr[j];
                    break;
                }
            }
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 15, 10, 8, 6, 12, 7 };
        nextGreater(arr);
    }
}


=============================================================================



import java.util.*;
public class j06_next_greater_element {

    static void nextGreater(int arr[]) {
        Deque<Integer> stack = new ArrayDeque<>();
        // int n=arr.length;
        stack.push(arr[arr.length - 1]);
        int res[] = new int[arr.length];
        res[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                stack.pop();
            }

            res[i] = (stack.isEmpty()) ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 15, 10, 8, 6, 12, 7 };
        nextGreater(arr);
    }
}


public class j14_next_greater {

    static void printnextGreater(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    flag = true;
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (!flag)
                System.out.print("-1" + " ");
        }
    }

    public static void main(String[] args) {

        // int[] arr = new int[] { 20, 30, 10, 5, 15 };
        int[] arr = new int[] { 5, 15, 10, 8, 6, 12, 9, 18 };
        printnextGreater(arr);

    }

}



========================================================================================================



import java.util.Stack;
public class j14_next_greater {

    static void printnextGreater(int arr[]) {
        Stack<Integer> s = new Stack<>();
        s.push(arr[arr.length-1]);
        for (int i = arr.length-1; i >=0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            int nextmax = s.isEmpty() ? -1 : s.peek();
            System.out.print(nextmax + " ");
            s.push(arr[i]);                     // it prints output in reverse order 
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 20, 30, 10, 5, 15 };
        // int[] arr = new int[] { 5, 15, 10, 8, 6, 12, 9, 18 };
        printnextGreater(arr);

    }

}

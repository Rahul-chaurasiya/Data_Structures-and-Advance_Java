import java.io.*;
import java.util.*;

class j15_largest_rect_area_histogram1 {

    public static int getMaxArea(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i])
                    curr += arr[i];
                else
                    break;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i])
                    curr += arr[i];
                else
                    break;
            }
            res = Math.max(res, curr);
        }
        return res;

    }

    public static void main(String[] args) {

        int[] arr = new int[] { 6, 2, 5, 4, 1, 5, 6 };
        System.out.print("Maximum Area: " + getMaxArea(arr, arr.length));

    }

}



======================================================================================================



import java.io.*;
import java.util.*;

class j15_largest_rect_area_histogram1 {

    public static int getMaxArea(int arr[], int n) {
        int res = 0;
        int[] ps = new int[n];
        int[] ns = new int[n];

        Stack<Integer> s = new Stack<>();
        s.add(0);
        for (int i = 0; i < n; i++) {
            while (s.isEmpty() == false && arr[s.peek()] >= arr[i])
                s.pop();
            int pse = s.isEmpty() ? -1 : s.peek();
            ps[i] = pse;
            s.push(i);
        }

        while (s.isEmpty() == false) {
            s.pop();
        }

        s.push(n - 1);
        for (int i = n - 1; i > 0; i--) {
            while (s.isEmpty() == false && arr[s.peek()] >= arr[i])
                s.pop();
            int nse = s.isEmpty() ? n : s.peek();
            ns[i] = nse;
            s.add(i);
        }

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            curr += (i - ps[i] - 1) * arr[i];
            curr += (ns[i] - i - 1) * arr[i];
            res = Math.max(res, curr);
        }
        return res;

    }

    public static void main(String[] args) {

        int[] arr = new int[] { 6, 2, 5, 4, 1, 5, 6 };

        System.out.print("Maximum Area: " + getMaxArea(arr, arr.length));

    }

}

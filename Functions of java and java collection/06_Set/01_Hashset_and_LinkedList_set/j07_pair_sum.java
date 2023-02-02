import java.util.*;
public class j07_pair_sum {
    static boolean isPair(int arr[], int sum) {

        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {

            if (s.contains(sum - arr[i]))
                return true;

            else
                s.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] argv) {
        int arr[] = { 3, 2, 8, 15, -8 };
        int sum = 17;

        System.out.print(isPair(arr, sum));
    }
}

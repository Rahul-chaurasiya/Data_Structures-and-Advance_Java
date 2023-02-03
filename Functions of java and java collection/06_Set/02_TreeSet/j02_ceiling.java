import java.util.*;
public class j02_ceiling {

    static void printCeilingRight(int arr[]) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.ceiling(arr[i]) == null)
                System.out.println("-1");
            else
                System.out.println(s.ceiling(arr[i]));
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 100, 50, 30, 60, 55, 32 };
        printCeilingRight(arr);
    }
}

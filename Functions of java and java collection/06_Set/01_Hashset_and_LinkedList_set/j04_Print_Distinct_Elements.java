public class j04_Print_Distinct_Elements {

    static void printDist(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] argv) {
        int arr[] = { 10, 8, 10, 10, 7 };
        printDist(arr);
    }
}


=====================================================================

  
import java.util.*;
public class j04_Print_Distinct_Elements {

    static void printDist(int arr[]) {
        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i]) == false) {
                System.out.print(arr[i] + " ");
                s.add(arr[i]);
            }
        }
    }

    public static void main(String[] argv) {
        int arr[] = { 10, 8, 10, 10, 7 };
        printDist(arr);
    }
}

public class j05_Print_Repeated_Elements {

    static void printRepeating(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag == true) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] argv) {
        int arr[] = { 10, 8, 10, 9, 12, 9 ,8};
        printRepeating(arr);
    }
}


=====================================================================

  
import java.util.*;
public class j05_Print_Repeated_Elements {

    static void printRepeating(int arr[]) {
        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i]) == true) {
                System.out.print(arr[i] + " ");
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] argv) {
        int arr[] = { 10, 8, 10, 9, 12, 9 ,8};
        printRepeating(arr);
    }
}

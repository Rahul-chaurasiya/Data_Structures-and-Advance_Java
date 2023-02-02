import java.util.*; 
public class j06_intersection {
    static void printIntersect(int a[], int b[]) {
        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < b.length; i++) {
            s.add(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (s.contains(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] argv) {
        // First array arr1[]
        int arr1[] = { 10, 15, 20, 25, 30, 50 };

        // Second array arr2[]
        int arr2[] = { 30, 5, 15, 80 };

        // Calling the Intersect method
        printIntersect(arr1, arr2);
    }
}

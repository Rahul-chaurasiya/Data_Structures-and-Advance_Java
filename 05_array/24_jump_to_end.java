
import java.util.*;
public class j24_jump_to_end {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int ptr = a - 1;
        int count = 0;
        for (int i = a - 2; i >= 0; i--) {
            if (arr[i] >= ptr - i) {
                ptr = i;
                count = count + 1;
            }

        }
        if (ptr != 0)
            System.out.println("-1");
        else
            System.out.println(count);
        sc.close();
    }
}

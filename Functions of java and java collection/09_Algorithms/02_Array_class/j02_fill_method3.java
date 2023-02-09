import java.util.*;
public class j02_fill_method3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        for (int[] row : arr) {
            Arrays.fill(row, 1);
        }

        System.out.println(Arrays.deepToString(arr));
    }
}

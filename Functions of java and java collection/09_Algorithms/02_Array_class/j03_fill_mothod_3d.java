
// Java program to fill a multidimensional array 
import java.util.Arrays;

class j03_fill_mothod_3d {
    public static void main(String[] args) {
        int[][][] ar = new int[3][4][5]; // Fill each row with -1.
        for (int[][] row : ar) {
            for (int[] rowColumn : row) {
                Arrays.fill(rowColumn, -1);
            }
        }
        System.out.println(Arrays.deepToString(ar));
    }
}

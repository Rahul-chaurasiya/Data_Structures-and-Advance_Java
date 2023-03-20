public class j06_boundary_traversal {
    static void bTraversal(int arr[][]) {
        int r = arr.length;
        int c = arr[1].length;
        for (int i = 0; i < c; i++)
            System.out.print(arr[0][i] + " ");

        for (int i = 1; i < r; i++)
            System.out.print(arr[i][r - 1] + " ");

        for (int i = c - 1; i >= 0; i--)
            System.out.print(arr[r - 1][i] + " ");

        for (int i = r - 2; i > 0; i--)
            System.out.print(arr[i][0] + " ");
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        bTraversal(arr);
    }
}

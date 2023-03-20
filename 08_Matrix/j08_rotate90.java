public class j08_rotate90 {

    static int n = 4;
    static void rotate90(int mat[][]) {
        int temp[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                temp[n - j - 1][i] = mat[i][j];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = temp[i][j];

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int n = arr.length;

        rotate90(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

}





// public class j08_rotate90 {

//     static void rotate90(int matrix[][]) {
//         int n = matrix.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n / 2; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][(n - 1 - j) % n];
//                 matrix[i][(n - 1 - j) % n] = temp;
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };
//         int n = arr.length;

//         rotate90(arr);

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }

//             System.out.println();
//         }
//     }

// }

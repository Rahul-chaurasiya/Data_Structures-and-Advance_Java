public class j04_snack_pattern {

    static void printSnake(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++)
                    System.out.print(arr[i][j] + " ");
            } else {
                for (int j = arr.length - 1; j >= 0; j--)
                    System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        printSnake(arr);
    }
}



public class j19_stock_buy_sell {

    static void maxprofit(int arr[], int n) {
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        // int arr[] = { 10, 10, 10, 30, 30, 40, 40 };
        // int n = 7;
        int arr[] = {1, 5, 3, 8, 12}, n = 5;
        maxprofit(arr, n);
    }
}

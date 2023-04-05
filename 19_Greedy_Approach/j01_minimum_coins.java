import java.util.Arrays;

public class j01_minimum_coins {
    static int minCoins(int arr[], int amount) {
        Arrays.sort((arr));
        int res = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= amount) {
                int c = (int) Math.floor(amount / arr[i]);
                res += c;
                amount -= c * arr[i];
            }
            if (amount == 0)
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        int coin[] = { 5, 10, 2, 1 }, amount = 57;
        System.out.println(minCoins(coin, amount));
    }
}

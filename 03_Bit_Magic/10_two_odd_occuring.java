

public class j10_two_odd_occuring {
    static void oddAppearing(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 }, n = 10;
        oddAppearing(arr, n);
    }
}



=======================================================================
  
// efficient solution
  
public class j10_two_odd_occuring {
    static void oddAppearing(int arr[], int n) {
        int xor = 0, res1 = 0, res2 = 0;

        for (int i = 0; i < n; i++)
            xor = xor ^ arr[i];

        int sn = xor & (~(xor - 1));
        for (int i = 0; i < n; i++) {
            if ((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1 + " " + res2);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 }, n = 10;
        oddAppearing(arr, n);
    }
}

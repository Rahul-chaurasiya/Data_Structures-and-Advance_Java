
public class j27_Max_sum_k_consecutive_elements {

    static int maxSum(int arr[],int n,int k){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i+k-1 < n; i++) {
            int sum=0;
            for(int j=0;j<k;j++){
                sum += arr[i+j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;
       System.out.println(maxSum(arr, n, k));
    }
}


=======================================================================


// efficient solution
public class j27_Max_sum_k_consecutive_elements {

    static int maxSum(int arr[],int n,int k){
        int max =0;
        int sum=0;

        for (int i = 0; i<k; i++) {
            sum += arr[i];
        }

        for (int i = k; i < n; i++) {
            sum += (arr[i]-arr[i-k]);
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;
       System.out.println(maxSum(arr, n, k));
    }
}

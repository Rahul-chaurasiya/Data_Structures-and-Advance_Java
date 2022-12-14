

public class j16_Maximum_Difference {

    static int maxdiff(int arr[],int n){
        int res = arr[1]-arr[0];
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1;j<n;j++){
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 10, 6, 5, 2};
        // int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        int n = 7;
        System.out.println(maxdiff(arr,n));
    }
}


=====================================================================================


public class j16_Maximum_Difference {

    static int maxdiff(int arr[],int n){
        int res = arr[1]-arr[0];
        int minval=arr[0];
        for (int i = 0; i < n-1; i++) {
            res = Math.max(res, arr[i]-minval);
            minval=Math.min(minval, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 10, 6, 5, 2};
        // int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        int n = 7;
        System.out.println(maxdiff(arr,n));
    }
}



public class j22_max_sum_subarray {

    static int max_sum(int arr[],int n){

        int res=arr[0];
        for(int i=0;i<n;i++){
            int curr=0;
            for(int j=i;j<n;j++){
                curr += arr[j];
                res = Math.max(curr, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // int arr[] = {1,-2,3,-1,2}, n=5;
        // int arr[] = {2,3,-8,7,-1,2,3}, n = 7;
        int arr[] = {-3,8,-2,4,-5,6}, n = 6;
        System.out.println(max_sum(arr, n));
    }
}


// efficient solution

public class j22_max_sum_subarray {

    static int max_sum(int arr[],int n){

        int res=arr[0];
        int maxend = arr[0];
        for(int i=0;i<n;i++){
            maxend = Math.max(maxend+arr[i],arr[i]);
            res = Math.max(maxend, res);            
        }
        return res;
    }

    public static void main(String[] args) {
        // int arr[] = {1,-2,3,-1,2}, n=5;
        // int arr[] = {2,3,-8,7,-1,2,3}, n = 7;
        int arr[] = {-3,8,-2,4,-5,6}, n = 6;
        System.out.println(max_sum(arr, n));
    }
}

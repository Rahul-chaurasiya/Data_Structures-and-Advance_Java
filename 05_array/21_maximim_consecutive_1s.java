


public class j21_maximim_consecutive_1s {

    static void max_consecutive_ones(int arr[],int n){

        int max=0,prevmax=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                max++;
                prevmax=Math.max(max, prevmax);
            }
    
            else {
                max=0;
            }
        }
        System.out.println(prevmax);
    }

    public static void main(String[] args) {
        // int arr[] = { 10, 10, 10, 30, 30, 40, 40 };
        // int n = 7;
        int arr[] = {0,1,1,0,1,0}, n = 6;
        max_consecutive_ones(arr, n);
    }
}

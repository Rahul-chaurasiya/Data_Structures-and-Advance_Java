public class j26_maximum_consecutive_flips {

    static void printGroups(int arr[],int n){
        int count_1=0;
        int count_0=0;
        boolean flag;
        if(arr[0] == 0) {
            flag = false;
            count_0++;
        }
        else {
            flag = true;
            count_1++;
        }

        for(int i=1;i<n;i++){
            if(arr[i] == 1){
                if(flag == false)
                count_1++;

                flag = true;
            }
            if(arr[i] == 0){
                if(flag == true)
                count_0++;

                flag = false;
            }
        }

        if(count_0>count_1){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 1){
                    System.out.print("from "+i+" to ");
                    while(arr[i]!=0) i++;
                    System.out.println(i-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0}, n = 9;
       printGroups(arr, n);
    }
}



=============================================================================


//efficient solution

public class j26_maximum_consecutive_flips {

    static void printGroups(int arr[], int n){
    	for(int i = 1; i < n; i++){
    		if(arr[i] != arr[i - 1]){
    			if(arr[i] != arr[0]) System.out.print("From " + i + " to ");
    			else System.out.println(i - 1);
    		}
    	}

    	if(arr[n - 1] != arr[0])
            System.out.println(n-1);
    }
    
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0}, n = 9;
       printGroups(arr, n);
    }
}

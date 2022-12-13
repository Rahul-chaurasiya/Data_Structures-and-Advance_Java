

import java.util.*;

class demo {

    static void print2largest(int arr[], int arr_size) {
        int i, first, second;

        if (arr_size < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }

        Arrays.sort(arr);

        for (i = arr_size - 2; i >= 0; i--) {
            if (arr[i] != arr[arr_size - 1]) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.printf("There is no second "
                + "largest element\n");
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 35, 1};
        int n = arr.length;
        print2largest(arr, n);
    }
}




===================================================================
  
  

import java.util.*;

class hello {

    int print2largest(int arr[], int n) {
        int res = -1;
        int max = getlargest(arr, n);
        for(int i=0;i<n;i++){
            if(arr[i] != arr[max]){
                if(res == -1) res = i;
                else if(arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
  
    int getlargest(int arr[], int n) {
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        
        hello a1 = new hello();
        int arr[] = {12, 35, 1, 10, 35, 1};
        int n = arr.length;
        a1.print2largest(arr, n+1);
    }
}



===============================================================================
  
  

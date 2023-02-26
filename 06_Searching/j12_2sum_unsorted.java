// Efficient method
// two pointer approach
public class j12_2sum_unsorted {
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        int i = 0;
        int j = i + 1;

        while (i < j) {
            if (nums[i] + nums[j] == target) {
                ans[0] = i;
                ans[1] = j;
                break;
            }
            if (j == (n - 1)) {
                i++;
                j = i + 1;
            } else
                j++;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        System.out.println(java.util.Arrays.toString(twoSum(A, n)));
    }
}


======================================================================================


// Efficient method
// brute force approach

public class j12_2sum_unsorted {
    static int[] twoSum(int[] nums, int target) {
        for (int c = 1; c < nums.length; c++) {
            for (int i = 0; i + c < nums.length; i++) {
                if (nums[i] + nums[i + c] == target) {
                    return new int[] { i, i + c };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        System.out.println(Arrays.toString(twoSum(A, n)));
    }
}

========================================================================================

// Hashset approch
import java.util.*;
public class j12_2sum_unsorted {
    static void printpairs(int arr[], int sum) {
        int ans[] = new int [2];
        HashMap<Integer,Integer> s = new HashMap<>();
        for (int i = 0; i < arr.length; ++i) {

            if (s.containsKey(sum - arr[i])) {
                ans[0] = i;
                ans[1] = s.get(sum - ans[i]);
            }
            s.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printpairs(A, n);
    }
}

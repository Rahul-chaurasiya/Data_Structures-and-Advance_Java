import java.util.*;

class j07_List_of_smaller_elements {

    static List<Integer> getSmaller(int[] arr, int k) {
        List<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                al.add(arr[i]);
            }
        }

        return al;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 40, 80, 30, 20, 15 };

        List<Integer> al = getSmaller(arr, 30);

        for (Integer x : al) {
            System.out.println(x);
        }
    }

}
import java.util.*;
public class j02_fill_method1 {
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40};

        // To fill complete array with a particular value
        Arrays.fill(arr, -1);
        System.out.println(Arrays.toString(arr));
    }
}

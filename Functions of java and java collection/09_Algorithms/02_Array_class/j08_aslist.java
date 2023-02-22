import java.util.*;

public class j08_aslist {
    public static void main(String[] args) {
        // creating Arrays of String type
        String arr[] = { "GfG", "IDE", "Courses" };

        // getting the list view of Array
        List<String> list = Arrays.asList(arr);

        // printing the list
        System.out.println(list);

        // Reversing the list In-place conversion
        Collections.reverse(Arrays.asList(arr));

        // Printing the array
        System.out.println(Arrays.toString(arr));

        // Modifying the array gets reflected in the list
        arr[0] = "Practice";

        // printing the list "GfG" is replaced by "Practice"
        System.out.println(list);

        // Modifying the list reflect changes in the array
        list.set(1, "Premium");

        // "IDE" is replaced by "Premium"
        System.out.println(Arrays.toString(arr));

        // ==============================================================================================

        // creating Arrays of String type
        String str[] = { "GfG", "IDE", "Courses" };

        // Creating a collection out of a list Any collection within the collection
        // interface can be created from a list
        HashSet<String> s = new HashSet<String>(Arrays.asList(str));

        // Printing the HashSet
        System.out.println(s);
    }
}

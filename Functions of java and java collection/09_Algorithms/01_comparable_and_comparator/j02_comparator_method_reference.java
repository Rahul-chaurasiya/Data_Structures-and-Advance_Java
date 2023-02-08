import java.util.*;
import java.io.*;

class j02_comparator_method_reference {
    public static void main(String[] args) throws IOException {
        String[] arr = { "gfg", "IDE", "GFG" };

        Arrays.sort(arr, String::compareToIgnoreCase);

        for (String s : arr) {
            System.out.print(s + " ");
        }

    }
}

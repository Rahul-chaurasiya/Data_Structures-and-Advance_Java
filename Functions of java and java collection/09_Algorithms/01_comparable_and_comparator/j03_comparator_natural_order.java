import java.util.Arrays;
import java.util.Comparator;
public class j03_comparator_natural_order {
    public static void main(String[] args) {

        String[] arr = { "gfg", null, "ide", null };

        Arrays.sort(arr, Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr));
    }

}

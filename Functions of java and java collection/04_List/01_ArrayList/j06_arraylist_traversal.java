import java.util.*;

public class j06_arraylist_traversal {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("gfg");
        al.add("ide");
        al.add("courses");

        // by get method
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // by for each loop
        for (String s : al) {
            System.out.println(s);
        }

        // using iterator method
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "");
        }

        // By for each method
        al.forEach(x -> System.out.println(x));
        
    }
}

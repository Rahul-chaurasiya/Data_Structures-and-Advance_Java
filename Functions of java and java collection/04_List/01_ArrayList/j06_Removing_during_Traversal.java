import java.util.*;

public class j06_Removing_during_Traversal {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(5);
        al.add(30);

        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            int x = (Integer) it.next();

            if (x < 10)
                it.remove();
            else
                System.out.println(x);
        }


        
        // practice program
        for (int i = 0; i < al.size(); i++) {
            int x = al.get(i);
            al.set(i, x * 2);
        }

        System.out.println(al);

    }
}
